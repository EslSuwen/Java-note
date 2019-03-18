
/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-18 18:54:44
 * @LastEditTime: 2019-03-18 19:17:48
 */

public class TestInstrument {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Violin violin = new Violin();
        Guitar guitar = new Guitar();

        Accord accord = new Accord();
        Instrument instrument = new Instrument();
        instrument.Play();
        instrument = piano;
        instrument.Play();
        instrument = violin;
        instrument.Play();
        instrument = guitar;
        instrument.Play();
        instrument = accord;
        instrument.Play();
    }
}