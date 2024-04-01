public class PetOwner {
    public void start(){
        
        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();

        vet.giveSghot(dog);
        vet.giveSghot(hippo);

    }
}
