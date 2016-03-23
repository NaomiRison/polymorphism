package NaomiR;
// creating new class in same file because it will be used once:
// def. of polymorphism, https://www.youtube.com/watch?v=d4Q5GrevAtw
// its when a variable, method or object take on 1 or more forms
//polymorphism enables you to write programs that process objects that share
// the same superclass as if they were all objects of the superclass
// involves override methods in sub classes

class  Movie {
    private  String name;
    public Movie( String name){
        this.name=name;

    }

    public  String plot(){

        return  "No plot here";
    }

    public String getName() {

        return name;
    }
}

class Jaws extends  Movie {

    public Jaws() {

        super("jaws");
        // super allows sub classes to
        // call parent class, like movie in this case
    }

    public String plot() {

        return " a shark eats lots of people";
    }  //notice methods named plot, so its been over written
}

    class IndependenceDay extends  Movie{

        public IndependenceDay(){
            // left quick, select generate and
            // then constructor. erase name in passed parameter
            // of constructor and call to parent class, super

            super(" independence day");// calls parent constuctor
        }

        @Override // left quick select override and select plot method
        public String plot() {
            return " aliens attempt to take over";
        }
    }
    class MazeRunner extends  Movie{

        public MazeRunner() {

            super(" maze runner");
        }

        @Override
        public String plot() {

            return " kids try and escape a maze";
        }
    }
    class Starwars extends  Movie{

        public Starwars() {
            super("star wars");
        }

        @Override
        public String plot() {
            return "imperial forces try to take over";
        }
    }
    class Forgetable extends  Movie{
        public Forgetable() {

            super(" forgetable");
        }
    } //no override written here no plot method.. as a result since im extending from movie class
    // the code  from output is : " no plot here " is executed.. use the plot method from extended class
    // Polymorphism :if inheriting from class and it has a mthid you automatically override that method!!

    /*
    5 classes made so far each has a plot method.
    now we will create a method that return one of the 5 classes, movies
    this new method is in main class
     */

public class Main {

    public static void main(String[] args) {
	// create a 4 loop

        for(int i=1; i<11;i++){

            Movie m=randomMovie();
            System.out.println(" movie # " + i +
            " : " + m.getName() + "\n " +
            " Plot "+ m.plot()+ "\n");
        }
        // m.plot() java is lookiing at object called m and looking if it
        // has a plot method
        // last class does not have plot methid so it goes
        // to super class and uses its method

    }

    public static Movie randomMovie(){
/*
 use a math function to generate random number for us
 this method returns double so we cast it to int
 by default the method returns a number between zero and 1
 then mult by 5 it then returns a num between 0 and 4
 and by adding 1 we return a number between 1 and 5

 */
        int randomnum=(int)(Math.random() *5)+1;
        System.out.println(" random number was :" + randomnum);
        switch (randomnum){
// use switch statement... there is no break because
// I have the return statement
// if you type certaind number you go to movie sub class
            case 1:
                return  new Jaws();

            case 2:
                return  new IndependenceDay();
            case 3:
                return  new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                 return new  Forgetable();
        }
        return null; // the else statement
    }
}

/*

 random number was :1
 movie # 1 : jaws
  Plot  a shark eats lots of people

 random number was :3
 movie # 2 :  maze runner
  Plot  kids try and escape a maze

 random number was :1
 movie # 3 : jaws
  Plot  a shark eats lots of people

 random number was :5
 movie # 4 :  forgetable
  Plot No plot here

 random number was :2
 movie # 5 :  independence day
  Plot  aliens attempt to take over

 random number was :5
 movie # 6 :  forgetable
  Plot No plot here

 random number was :1
 movie # 7 : jaws
  Plot  a shark eats lots of people

 random number was :4
 movie # 8 : star wars
  Plot imperial forces try to take over

 random number was :2
 movie # 9 :  independence day
  Plot  aliens attempt to take over

 random number was :2
 movie # 10 :  independence day
  Plot  aliens attempt to take over

 */






