//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main{
    public static void main(String[] args){
    // Easy: Write a program to print "Hello, Java!".
        System.out.println("Hello, Java");

    // Medium: Write a program to display your name, age, and favorite hobby in separate lines.
        String name = "Shravani Machampalli";
        int age = 24;
        String hobbies = "Artistry, Cooking";
        System.out.println("My name is " + name);
        System.out.println("I am " + age+ " years old");
        System.out.println("My favorite hobbies are " + hobbies);

    // Hard: Write a program that formats and displays a table with your name, age, and hobby aligned properly.
        System.out.format("%-40s %-5s %-20s\n", "Name", "Age", "Hobby");
        System.out.println("-----------------------------------------------------------------------");
        System.out.format("%-40s %-5d %-20s\n", name, age, hobbies);

    }
}