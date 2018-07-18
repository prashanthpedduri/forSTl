# forSTl
I would like to create the classes in the following manner.


1. Animals would be the super class of all
  1.1 Birds would extend Animals and would adopt behavior like CanFly, CanWalk etc.
    1.1.1 Birds Family will contain classes like Duck, Chicken/Rooster (explained later) & Parrot.
    1.1.2 A rooster is a Male Chicken, hence I wouldn't be representing it as a separate class.
    1.1.3 A Parrot can have one neighbour OR one/many influencers (added to address cellphone tone etc.)
  1.2 Fish would extend Animal and has behaviour like CanSwim
    1.2.1 A Dolphin is not a Fish kind but it extends Animal and has same CanSwim behaviour (Per assignment Q:3.a, otherwise It would be good if Dolphin extendeds Fish)
    1.2.2 Shark and ClownFish are two subclasses of Fish and has different characteristics (like eating and makeJokes )
  1.3 Mammals are Animal kind and would have behaviour like CanWalk 
    1.3.1 Dog, Cat, Frog and Human(currently unimplemented but can be done) extend Mammals
  1.4 Special Category (Change in behaviour)
    1.4.1 A Caterpillar would transform to a Butterfly as the times goes by. So, the best way (to my knowledge) is to represent this change of characteristic by a property (state) and manage the internal behaviour accordingly.
  1.5 Utilities
    1.5.1 We might need some util classes to maintain/represent states or Gender etc.
  1.6 Tests
    1.5.2 Will write meaningful test cases for some important classes. The scope is vast such that it might take some more amount of time to write an extensive suit.
    
    
