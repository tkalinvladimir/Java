// ex6 - ex7 - ex8

import java.util.Random;

enum Note{
    Am,Dm,C;
}

class Instrument{
    void play(Note n) {System.out.println("Instrument.play() "+n);}
    public String toString(){return "Instrument";}
    void adjust() {System.out.println("Instrument.adjust() ");}
}

class Wind extends Instrument{
    void play(Note n) {System.out.println("Wind.play() "+n);}
    public String toString(){return "Wind";}
    void adjust() {System.out.println("Wind.adjust() ");}
}

class Baraban extends Instrument{
    void play(Note n) {System.out.println("Baraban.play() "+n);}
    public String toString(){return "Baraban";}
    void adjust() {System.out.println("Baraban.adjust() ");}
}

class Percussion extends Instrument{
    void play(Note n) {System.out.println("Percussion.play() "+n);}
    public String toString(){return "Percussion";}
    void adjust() {System.out.println("Percussion.adjust() ");}
}

class Stringed extends Instrument{
    void play(Note n) {System.out.println("Stringed.play() "+n);}
    public String toString(){return "Stringed";}
    void adjust() {System.out.println("Stringed.adjust() ");}
}

class Brass extends Wind{
    void play(Note n) {System.out.println("Brass.play() "+n);}
    void adjust() {System.out.println("Brass.adjust() ");}
}

class Woodwind extends Wind{
    void play(Note n) {System.out.println("Woodwind.play() "+n);}
    void adjust() {System.out.println("Woodwind.adjust() ");}
}

public class ex6 {

    public static Instrument next(){
        Random rand = new Random();

        switch(rand.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Baraban();
        }
    }

    public static void tune(Instrument i){
        i.play(Note.Am);
    }

    public static void tuneAll(Instrument[] i){
        for(Instrument someInstrument:i) {
            tune(someInstrument);
        }
    }

    public static void main(String[] args){
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), new Baraban() };
        tuneAll(orchestra);
        System.out.println("_______________");
        System.out.println("Instruments: " + new Wind() + " " + new Percussion() +
                " " + new Stringed() + " " + new Brass()  + " " + new Woodwind() + " " + new Baraban());
        System.out.println("_______________");
        Instrument[] orchestra2 = new Instrument[10];
        for (int i = 0; i<orchestra2.length; i++){
            orchestra2[i] = next();
        }
        tuneAll(orchestra2);

    }

}
