/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-18 18:39:23
 * @LastEditTime: 2019-03-18 19:10:15
 */

public class Instrument {
    public String name;
    public String band;

    Instrument() {
    }

    Instrument(String name, String band) {
        this.name = name;
        this.band = band;
    }

    public void Play() {
        System.out.println("can be played");
    }
}






