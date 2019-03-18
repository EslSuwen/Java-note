/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-18 19:09:11
 * @LastEditTime: 2019-03-18 19:10:15
 */
public class Guitar extends Instrument {
    public int chordNum;

    Guitar() {
    }

    Guitar(String name, String band, int chordNum) {
        super(name, band);
        this.chordNum = chordNum;
    }

    public void Play() {
        System.out.println("play Guitar");
    }
}