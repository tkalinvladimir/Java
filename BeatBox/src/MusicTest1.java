import javax.sound.midi.*;


public class MusicTest1 {

    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
        mt.play2(3,7);
    }

    public void play() {

        try {

            // make (and open) a sequencer, make a sequence and track

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            // now make two midi events (containing a midi message)
            MidiEvent event = null;

            // first make the message
            // then stick the message into a midi event
            // and add the event to the track

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 20, 100);
            MidiEvent noteOn = new MidiEvent(a, 1); // <-- means at tick one, the above event happens
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 4); // <-- means at tick one, the above event happens
            track.add(noteOff);

            // add the events to the track

            // add the sequence to the sequencer, set timing, and start
            sequencer.setSequence(seq);

            sequencer.start();
            // new
            Thread.sleep(1000);
            sequencer.close();
            System.exit(0);
        } catch (Exception ex) {ex.printStackTrace();}
    } // close play

    public void play2(int instrument, int note) {

        try {

            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);


            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);
            player.setSequence(seq);
            player.start();
            // new
            Thread.sleep(5000);
            player.close();
            System.exit(0);

        } catch (Exception ex) {ex.printStackTrace();}
    } // close play


}
