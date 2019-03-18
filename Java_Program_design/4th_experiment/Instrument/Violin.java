/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-18 19:09:04
 * @LastEditTime: 2019-03-18 19:09:58
 */
public class Violin extends Instrument {
    public int chordNum;

    Violin() {
    }

    Violin(String name, String band, int chordNum) {
        super(name, band);
        this.chordNum = chordNum;
    }

    public void Play() {
        System.out.println("play Violin");
    }
}