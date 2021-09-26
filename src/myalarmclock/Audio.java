/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myalarmclock;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/**
 *
 * @author ANTONIO
 */
public class Audio {
    
    private Clip clip;
    
    public Audio(){
        init();
    }
    
    private void init(){
        String name = "sound.wav";
        try{
         File file = new File (getClass().getResource(name).getFile());
         AudioInputStream stream = AudioSystem.getAudioInputStream(file);
         AudioFormat format = stream.getFormat();
         DataLine.Info info = new DataLine.Info(Clip.class, format);
         Clip line = (Clip)AudioSystem.getLine(info);
         line.open(stream);
         line.setLoopPoints(0, -1);
         clip = line;
         
        }catch(Throwable ex){
            throw new Error(ex.getMessage());
        }
    }
    
    public void play(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public void stop(){
        clip.stop();
        clip.setFramePosition(0);
    }
    
}
