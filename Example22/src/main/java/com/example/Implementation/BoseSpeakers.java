package com.example.Implementation;

import com.example.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers {
    public String makeSound(Song song){
        return "Playing the song "+ song.getTitle()+ " by "
                + song.getSingerName()+
                " with Bose speakers";
    }
}
