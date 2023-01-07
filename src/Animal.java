public abstract class Animal extends IAnimal {
    String name;
    int age;


    public void printName(){
        System.out.println("The name is" + name);
    }
    public void printAge(){
        System.out.println("The age is" + age);
    }


    abstract void makeSomeNoise();


    public abstract void play();
}





