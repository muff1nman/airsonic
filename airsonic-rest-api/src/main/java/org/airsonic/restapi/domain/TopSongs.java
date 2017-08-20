package org.airsonic.restapi.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopSongs", propOrder = {
        "song"
})
public class TopSongs {

    protected List<Child> song;

    public List<Child> getSong() {
        if (song == null) {
            song = new ArrayList<>();
        }
        return this.song;
    }

}