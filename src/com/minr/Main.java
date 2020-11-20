package com.minr;

import java.util.Scanner;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program deskripsi character
 * inspiration by ilham zaki
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====Program Mengenal Karakter \"Anime Detective Conan\"=====");
        System.out.println("\nList Character :");
        
        // main char
        MainCharacters main = new MainCharacters();
        main.tampilKarakter(main.mainChar);
        
        // middle char
        MiddleCharacters middle = new MiddleCharacters();
        middle.tampilKarakter(middle.middleChar);
        
        // little detective group char
        LittleDetectiveGroup little = new LittleDetectiveGroup();
        little.tampilKarakter(little.littleChar);
        
        // professor char
        Professor prof = new Professor();
        prof.tampilKarakter(prof.profChar);
        
        // list detective & list black Organization
        System.out.println("\n-----------------------------");
        Detective detec = new Detective();
        detec.tampilKarakter(detec.listDetec);
        BlackOrganization blackO = new BlackOrganization();
        blackO.tampilKarakter(blackO.listBlackO);
        
        System.out.println("\n=======Pilih Karakter Yang Ingin Anda Tau=====");
        System.out.print("Nomor Karakter : ");
        Byte pilih = scanner.nextByte();
        
        // tampil karakter
        Character karakter = new Character();
        karakter.pilihKarakter(pilih);
                
    }
    
}
