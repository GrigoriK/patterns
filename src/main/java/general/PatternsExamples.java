package general;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.ChainOfResponsibility.CallNotifier;
import patterns.behavioural.ChainOfResponsibility.EmailNotifier;
import patterns.behavioural.ChainOfResponsibility.JiraNotifier;
import patterns.behavioural.ChainOfResponsibility.Notifier;
import patterns.behavioural.ChainOfResponsibility.enums.Priority;
import patterns.behavioural.Observer.MusicAudioHosting;
import patterns.behavioural.Observer.MusicTrack;
import patterns.behavioural.Observer.Subscriber;
import patterns.behavioural.command.*;
import patterns.behavioural.iterator.data.RoutePoint;
import patterns.behavioural.iterator.iterators.GuideIterator;
import patterns.behavioural.mediator.Dispatcher;
import patterns.behavioural.mediator.FlightControl;
import patterns.behavioural.mediator.Pilot;
import patterns.behavioural.memento.Gui;
import patterns.behavioural.memento.Project;
import patterns.behavioural.state.Sleep;
import patterns.behavioural.state.StateService;
import patterns.behavioural.strategy.ActivityBeforeGoToBed;
import patterns.behavioural.strategy.ChargeSmartphone;
import patterns.behavioural.strategy.TurnOffComputer;
import patterns.behavioural.strategy.TurnOffTheLight;
import patterns.behavioural.templateMethod.Pancakes;
import patterns.behavioural.templateMethod.Spaghetti;
import patterns.behavioural.templateMethod.Supper;
import patterns.behavioural.visitor.*;
import patterns.creation.abstractFactory.AbstractTextileFactory;
import patterns.creation.abstractFactory.enums.ClothesType;
import patterns.creation.abstractFactory.enums.FactoryType;
import patterns.creation.abstractFactory.enums.ShoesType;
import patterns.creation.abstractFactory.interfaces.Clothes;
import patterns.creation.abstractFactory.interfaces.Shoes;
import patterns.creation.abstractFactory.interfaces.TextileFactory;
import patterns.creation.builder.impl.HouseBuilderImpl;
import patterns.creation.factory.TelephoneFactory;
import patterns.creation.factory.enums.TelephoneType;
import patterns.creation.factory.interfaces.Telephone;
import patterns.creation.prototype.Car;
import patterns.creation.prototype.CarFabric;
import patterns.creation.singleton.Russia;
import patterns.structural.adapter.*;
import patterns.structural.bridge.impl.HuaweiShop;
import patterns.structural.composite.Branch;
import patterns.structural.composite.Leaf;
import patterns.structural.composite.Tree;
import patterns.structural.decorator.impl.Orchestra;
import patterns.structural.decorator.impl.decorator.Drummer;
import patterns.structural.decorator.impl.decorator.Guitarist;
import patterns.structural.decorator.impl.decorator.Singer;
import patterns.structural.decorator.interfaces.Music;
import patterns.structural.facade.Client;
import patterns.structural.facade.enums.FoodItem;
import patterns.structural.proxy.CoffeeDiscount;

import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class PatternsExamples {
    public static void iteratorExample() {
        GuideIterator guideIterator = new GuideIterator(Arrays.asList(RoutePoint.MOSCOW
                , RoutePoint.TVER, RoutePoint.VELIKY_NOVGOROD, RoutePoint.SAINT_PETERSBURG));
        while (guideIterator.hasNext()) {
            log.info(guideIterator.next());
        }

    }

    public static void mediatorExample() {
        FlightControl flightControl = new FlightControl();
        Dispatcher dispatcher = new Dispatcher(flightControl, "Ivan Letuchii");
        Pilot pilot1 = new Pilot("AK-382", flightControl);
        Pilot pilot2 = new Pilot("LV-356", flightControl);
        Pilot pilot3 = new Pilot("WT-976", flightControl);
        Pilot pilot4 = new Pilot("ME-489", flightControl);
        flightControl.setDispatcher(dispatcher);
        flightControl.addPilot(pilot1);
        flightControl.addPilot(pilot2);
        flightControl.addPilot(pilot3);
        flightControl.addPilot(pilot4);
        dispatcher.sendMessage("Please say your location.");


    }

    public static void mementoExample() {
        Gui gui = new Gui();
        Project project = new Project();
        gui.setMainColor("Green");
        gui.setFontName("Tm-Rn");
        gui.addShape(() -> "triangle");
        gui.addShape(() -> "circle");
        gui.addShape(() -> "square");
        log.info("Current GUI:{}", gui.toString());
        log.info("Save changes");
        project.setSnapshot(gui.getSnapshotV1());
        log.info("Save changes with Snapshot version 2");
        project.setSnapshotV2(gui.getSnapshotV2());

        log.info("Change color and font");
        gui.setFontName("Arial");
        gui.setMainColor("Yellow");
        log.info("Current GUI:{}", gui.toString());

        log.info("Loading from snapshotV1");
        gui.loadV1(project.getSnapshot());
        log.info("Current GUI:{}", gui.toString());

        log.info("Change color and font");
        gui.setFontName("Arial");
        gui.setMainColor("Blue");
        log.info("Current GUI:{}", gui.toString());

        log.info("Loading from snapshotV2");
        gui.loadV2(project.getSnapshotV2());
        log.info("Current GUI:{}", gui.toString());


    }

    public static void commandExample() {
        HPMFP hpmfp = new HPMFP();
        Receiver receiver = new Receiver(new PrintCommand(hpmfp),
                new CopyCommand(hpmfp),
                new ScanCommand(hpmfp));
        receiver.copy();
        receiver.print();
        receiver.scan();


    }

    public static void factoryExample() {
        Telephone telephoneM = TelephoneFactory.produceTelephone(TelephoneType.MOBILE);
        Telephone telephoneF = TelephoneFactory.produceTelephone(TelephoneType.FIXED);
        if (telephoneM != null) {
            telephoneM.call();
        }
        if (telephoneF != null) {
            telephoneF.call();
        }

    }

    public static void decoratorExample() {
        Music music = new Drummer(new Guitarist(new Singer(new Orchestra())));
        music.play();

    }

    public static void facadeExample() {
        Client client1 = new Client();
        Client client2 = new Client();
        client1.addFood(FoodItem.CAKE, 3);
        client1.addFood(FoodItem.PIZZA, 1);
        client1.addFood(FoodItem.SUSHI, 2);

        client2.addFood(FoodItem.SALAD, 3);
        client2.addFood(FoodItem.SPAGHETTI, 1);
        client2.addFood(FoodItem.SUSHI, 2);
        client1.makeOrder();
        log.info("\n");
        client2.makeOrder();

    }

    public static void builderExample() {
        HouseBuilderImpl houseBuilder = new HouseBuilderImpl();
        houseBuilder.buildIKEAYellowHouse();
        log.info(houseBuilder.getHouse().toString());

    }

    public static void singletonExample() {
        Russia russia1 = Russia.getRussia();
        Russia russia2 = Russia.getRussia();
        log.info("russia1 and russia 2 is equals: {}", russia1.equals(russia2));
        log.info("russia1 hashCode:{}", russia1.hashCode());
        log.info("russia2 hashCode:{}", russia2.hashCode());

    }

    public static void adapterExample() {
        TV tv = new TV("LG-HTY-567");
        Projector projector = new Projector("TER-JDKS");
        HDMIWire hdmiWire = new HDMIWire();
        VGAWire vgaWire = new VGAWire();
        tv.connectHDMIToTV(hdmiWire);
        AdapterVGAToHDMI adapterHDMIToVGA = new AdapterVGAToHDMI(hdmiWire);
        projector.connectVGAToTV(adapterHDMIToVGA);
        log.info(hdmiWire.toString());

    }

    public static void bridgeExample() {
        HuaweiShop.sellHuaweiMobilePone();
        HuaweiShop.sellHuaweiTablet();

    }

    public static void visitorExample() {
        GovernmentRecycleProgram program =
                new GovernmentRecycleProgram();
        program.setIncinerationplant(new Incinerationplant());
        program.getIncinerationplant().recyclePaper(new Paper());
        program.getIncinerationplant().recyclePaper(new Paper());
        program.getIncinerationplant().recyclePaper(new Paper());
        program.getIncinerationplant().recyclePaper(new Paper());


        log.info("\n==========\n");

        program.getIncinerationplant().recyclePCan(new Can());
        program.getIncinerationplant().recyclePCan(new Can());
        program.getIncinerationplant().recyclePCan(new Can());
        program.getIncinerationplant().recyclePCan(new Can());

        log.info("\n==========\n");

        program.getIncinerationplant().recyclePlastic(new Plastic());
        program.getIncinerationplant().recyclePlastic(new Plastic());
        program.getIncinerationplant().recyclePlastic(new Plastic());
        program.getIncinerationplant().recyclePlastic(new Plastic());
    }

    public static void templateMethodExample() {
        Supper supper1 = new Spaghetti();
        Supper supper2 = new Pancakes();
        supper1.cookSomething();
        supper2.cookSomething();
    }

    public static void strategyExample() {
        ActivityBeforeGoToBed activityService = new ActivityBeforeGoToBed();
        activityService.setStrategy(new TurnOffComputer());
        activityService.executeActivity();

        activityService.setStrategy(new TurnOffTheLight());
        activityService.executeActivity();

        activityService.setStrategy(new ChargeSmartphone());
        activityService.executeActivity();
    }

    public static void stateExample() {
        StateService stateService = new StateService(new Sleep());
        stateService.showCurrentActivity();
        do {
            stateService.changeState();
            stateService.showCurrentActivity();
        } while (!(stateService.getState() instanceof Sleep));
    }

    public static void observerExample() {
        MusicAudioHosting musicAudioHosting = new MusicAudioHosting();
        Subscriber subscriber1 = new Subscriber("Grigo K.");
        Subscriber subscriber2 = new Subscriber("Michail Vilok");
        Subscriber subscriber3 = new Subscriber("Idras Municherry");
        musicAudioHosting.addObserver(subscriber1);
        musicAudioHosting.addObserver(subscriber2);
        musicAudioHosting.addObserver(subscriber3);
        MusicTrack queenTrack = new MusicTrack(UUID.randomUUID(), "Queen",
                "We are the champions");
        musicAudioHosting.addEvent(
                new MusicTrack(UUID.randomUUID(), "Bruno Mars",
                        "Lazy song"));
        musicAudioHosting.addEvent(
                queenTrack);
        musicAudioHosting.addEvent(
                new MusicTrack(UUID.randomUUID(), "Green day",
                        "Back in the USA "));
        musicAudioHosting.addEvent(
                new MusicTrack(UUID.randomUUID(), "Metallica",
                        "Fuel"));

        musicAudioHosting.removeEvent(queenTrack);

    }

    public static void compositeExample() {
        Tree tree = new Tree();
        Branch branch1 = new Branch();
        Branch branch2 = new Branch();
        Branch branch3 = new Branch();
        branch1.setLeaf(Stream.generate(() -> new Leaf("yellow")).limit(10).collect(Collectors.toList()));
        branch2.setLeaf(Stream.generate(() -> new Leaf("green")).limit(10).collect(Collectors.toList()));
        branch3.setLeaf(Stream.generate(() -> new Leaf("red")).limit(10).collect(Collectors.toList()));
        branch1.setBranches(Collections.singleton(branch2));
        branch2.setBranches(Collections.singleton(branch3));

        tree.setBranches(Collections.singleton(branch1));
        log.info("Count of leafs in tree: {}", tree.branchesLeafCount());

    }

    public static void prototypeExample() {
        CarFabric carFabric = new CarFabric();
        Car newTestCar = carFabric.getNewTestCar();
        Car carWithBlueDoorsByPrototype = carFabric.getCarWithBlueDoorsByPrototype(newTestCar);
        log.info(newTestCar.toString());
        log.info(carWithBlueDoorsByPrototype.toString());

    }

    public static void abstractFactory() {
        TextileFactory factoryGucci = AbstractTextileFactory.getFactory(FactoryType.GUCCI);
        TextileFactory factoryLV = AbstractTextileFactory.getFactory(FactoryType.LV);
        if (factoryGucci != null) {
            Shoes shoes = factoryGucci.produceShoes(ShoesType.SLAPS, Color.BLUE);
            shoes.sew();
            Clothes clothes = factoryGucci.produceClothes(ClothesType.HAT, Color.GREEN);
            clothes.sew();
        }

        if (factoryLV != null) {
            Shoes shoes = factoryLV.produceShoes(ShoesType.SLAPS, Color.BLUE);
            shoes.sew();
            Clothes clothes = factoryLV.produceClothes(ClothesType.HAT, Color.GREEN);
            clothes.sew();
        }


    }

    public static void сhainOfResponsibilityExample() {

        Notifier jiraNotifier = new JiraNotifier();
        Notifier emailNotifier = new EmailNotifier();
        Notifier callNotifier = new CallNotifier();
        jiraNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(callNotifier);

        jiraNotifier.notifyByPriority("Production server was down", Priority.SUPER_CRITICAL);

    }

    public static void proxyExample() {

        CoffeeDiscount coffeeDiscount = new CoffeeDiscount();
        coffeeDiscount.produceBrandingCups();
    }
}
