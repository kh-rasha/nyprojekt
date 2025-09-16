import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. Skriv ut "Hello World" i konsolen.
        System.out.println("Hello world.");

//2. Skriv 4 olika variabler som har datatyperna int, double, String, boolean

        int age = (27);
        double pris = 99.5;
        string name = Rasha;
        boolean isStudent =true;
        System.out.println("age = " + age );
        System.out.println("pris=" + pris);
        System.out.println("name=" + name);
        System.out.println("isStudent= " + isStudent);


//3. Skriv en if-sats som kollar om värdet på din tidigare skapade int är ett värde över 5.


        if (age > 5) {
            System.out.println("Värdet är större än 5");

//Om värdet är större än 5 skriv ut i konsolen: "Siffran är mer än 5"



//4. Skriv en for loop som repeteras 5 gånger och skriver i varje iteration ut i (antalet iterationer).


                for (int i = 1; i <= 5; i++) {
                    System.out.println("Iteration: " + i);

//5. Skapa en Array som har 5 ints.
                    int[] numbers = new int[5];

                    // Tilldelar värden till arrayen
                    numbers[0] = 10;
                    numbers[1] = 20;
                    numbers[2] = 30;
                    numbers[3] = 40;
                    numbers[4] = 50;

                    // Skriver ut alla värden
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.println("Element " + i + ": " + numbers[i]);

//6. Skapa en Array med 5 Strings.
                        String[] names = {"Anna", "Omar", "Sara", "Lina", "David"};

//7. Loopa igenom din andra array med strängar för att skriva ut samtliga texter i Arrayen i var sin rad i konsolen.
                        for (String name : names) {
                            System.out.println(name);
                        }

//8. Skapa en ArrayList av Integers som innehåller 5 integer som du väljer själv.
                        ArrayList<Integer> numbers = new ArrayList<>();
                        numbers.add(3);
                        numbers.add(6);
                        numbers.add(9);
                        numbers.add(12);
                        numbers.add(15);

//9. Öka den fjärde siffrans värde med 4.
//9.1 Skriv ut hela ArrayListen i Konsolen.
                        int index = 3;
                        numbers.set(index, numbers.get(index) + 4);
                        System.out.println("ArrayList efter ökning: " + numbers);
//10. Skriv en metod som skriver ut "Jag har skapat en metod i Java" metoden ska inte returnera ett värde.
//Kalla på metoden

                        printCreatedMethod();

//11. Skriv en metod vid namn add som tar emot 2 integers och returnerar deras summa (int).
//11.1 Använd metoden och skriv ut resultatet i konsolen.
                        int sum = add(12, 8);
                        System.out.println("Summan av 12 och 8 är: " + sum);

//12.1 Skriv en klass som heter Animal. Animal ska ha en namnvariabel (String).
//12.2 Skapa en metod som skriver ut i konsolen när man kallar på metoden. Döp metoden makeSound.
//12.3 Instansiera klassen och kalla på objektets metod makeSound.
                        class Animal {
                            // Namn inkapslat: privat + publik getter
                            private String name;

                            public Animal(String name) {
                                this.name = name;
                            }

                            public String getName() { // behövs av subklasser
                                return name;
                            }

                            public void makeSound() {
                                System.out.println(getName() + " gör ett djurljud.");
                            }
                        }

//13.1 Skapa en subklass som ärver från Animal. Subklassen ska vara en valfri djurart.
//13.2 Med hjälp av polymorfism skriv över makeSound metoden från superklassen Animal och få ditt nya djur att göra ett nytt ljud.
//13.3 Instansiera din subklass och kalla på metoden makeSound.
                        class Dog extends Animal {
                            public Dog(String name) {
                                super(name);
                            }

                            @Override
                            public void makeSound() {
                                System.out.println(getName() + " säger: voff!");
                            }
                        }





