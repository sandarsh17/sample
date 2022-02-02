class Animal {
    def name,color

     def setAnimalChar(Name,Color){
         name = Name
         color = Color
     }
    def getAnimalChar()
    {
        print "${name} is ${color}"
    }

    static void main(args){
        Animal dog = new Animal()
        dog.setAnimalChar("German Shepherd","Black")
        dog.getAnimalChar()
    }
}
