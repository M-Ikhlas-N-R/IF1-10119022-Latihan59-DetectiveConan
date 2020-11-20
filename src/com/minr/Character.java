package com.minr;

public class Character {
    
    public void tampilKarakter(String[] nama) {
        for (String nama1 : nama) {
            System.out.println(nama1);
        }
    }
    
    public void pilihKarakter(byte pilih) {
        switch (pilih) {
            case 1 :
                System.out.println("\n====== Shinichi Kudo ======");
                System.out.println("- Nama asli : Shinichi Kudo \n" +
                                   "- Nama samaran (ketika menjadi kecil) : Conan Edogawa \n" +
                                   "Detektif SMA terkenal dari SMU Teitan, dan sering disebut \"Detektif dari timur\" \n" +
                                   "ia menjadi kecil ketika ia sedang meilhat kasus transaksi ilegal \n" +
                                   "oleh gin dan vodka, lalu meminumkan obat yang bernama APTK 4869 kepada shinichi");
                break;
                 
            case 2 :
                System.out.println("\n====== Ran Mouri ======");
                System.out.println("- Siswi SMU Teitan \n" +
                                   "- Teman sekelas Shinichi sejak kecil \n" +
                                   "- Tidak mengetahui identitas asli conan \n" +
                                   "- Anak dari Kogoro Mouri dan Eri Kisaki \n" +
                                   "Siswi di SMU Teitan yang sekaligus teman sekelas dan semasa kecilnya Shinichi. \n" +
                                   "Ia selalu menunggu kepulangan Shinichi. Ran beberapa kali pernah mencurigai Conan \n" +
                                   "yang identitasnya adalah Shinichi, tetapi Conan selalu berhasil mengelabui Ran. \n" +
                                   "Ia mempunyai bakat dalam karate, dan takut dengan hantu. Memiliki sifat yang lembut dan gampang menangis.");
                break;
                
            case 3 :
                System.out.println("\n====== Kogoro Mouri ======");
                System.out.println("- Pekerjaan : Detektif \n" +
                                   "- Ayah Ran Mouri \n" +
                                   "Kogoro Mouri adalah ayahnya Ran yang bekerja sebagai Detektif. Tetapi, \n" +
                                   "jika ia membuat analisis, pasti analisis itu hanyalah \"asal-asalan\". \n" +
                                   "Conan yang biasa bersama Kogoro yang selalu bertemu kasus, Kogoro selalu dipakai Conan \n" +
                                   "untuk memecahkan kasus dengan cara menidurkannya dengan peluru bius dan maka dari itu \n" +
                                   "ia menjadi terkenal dengan sebutan \"Kogoro Tidur\".");
                break;
                
            case 4 :
                System.out.println("\n====== Sonoko Suzuki ======");
                System.out.println("- Teman sekelas Ran Mouri dan juga teman baiknya \n" +
                                   "- Siswi SMU Teitan \n" +
                                   "Sonoko adalah teman sekelas Ran dan juga teman baiknya. Berasal dari keluarga kaya. \n" +
                                   "Ia suka menarik perhatian laki-laki yang dipilihnya. Saat ini ia berhubungan \n" +
                                   "dengan Makoto Kyogoku, seseorang yang disebut sebagai Raja Karate yang dulu pernah \n" +
                                   "menolong Sonoko ketika ia akan dibunuh oleh seseorang bule yang sekaligus pelaku pembunuhan \n" +
                                   "gadis berambut pirang. Saat Kogoro tidak ada, Conan kadang memakai Sonoko untuk membuat analisis.");
                break;
                
            case 5 :
                System.out.println("\n====== Heiji Hattori ======");
                System.out.println("- \"Detektif yang berasal dari barat\" yang merupakan saingan shinichi \n" +
                                   "- Bekerja sama dengan shinichi setelah mengetahui identitas conan adalah shinichi \n" +
                                   "Detektif yang berasal dari barat yang merupakan saingan Shinichi. Setelah mengetahui \n" +
                                   "identitas Conan adalah Shinichi, mereka menjadi akrab dan sering bekerja sama untuk \n" + 
                                   "memecahkan suatu kasus. Ia mempunyai teman sejak kecil sama seperti Shinichi dan Ran, \n" + 
                                   "yaitu Kazuha. Sepertinya ia mempunyai rasa kepada Kazuha, tetapi ia malu untuk mengatakannya \n" + 
                                   "begitu juga sebaliknya. Ayahnya adalah Heizo Hattori yang bekerja di kepolisian Osaka. Ia juga bisa kendo.");
                break;
                
            case 6 :
                System.out.println("\n====== Kazuna Tooyama ======");
                System.out.println("- Teman sejak kecil Heiji Hattori \n" +
                                   "- Saling menyukai dan selalu bersama-sama dengan Heiji \n" +
                                   "Kazuha adalah teman semasa kecilnya Heiji yang menyukai Heiji. \n" +
                                   "Jika Heiji muncul dalam cerita, ia selalu nampak bersamanya. \n" + 
                                   "Terampil dalam Aikido dan takut dengan hantu sama dengan Ran.");
                break;
                
            case 7 :
                System.out.println("\n====== Eri Kisaki ======");
                System.out.println("- Pekerjaan : pengacara \n" +
                                   "- Ibu Ran Mouri \n" +
                                   "Ibu nya Ran dan juga istri Kogoro. Bekerja sebagai pengacara dan disebut \n" +
                                   "sebagai \"Ratu Pengacara\". Pisah tempat tinggal dengan Kogoro karena \n" +
                                   "Kogoro selalu mabuk-mabukan, bertaruh, dan sebagainya hal2 yang membuat Eri kesal. \n" + 
                                   "Namun, ia masih menaruh perasaan terhadap Kogoro dan cincin kawinnya masih dipakai. \n" + 
                                   "Mempunyai kucing yang bernama Goro, nama tersebut berasal dari nama Kogoro.");
                break;
                
            case 8 :
                System.out.println("\n====== Conan Edogawa ======");
                System.out.println("- Nama asli : Shinichi Kudo \n" +
                                   "- Nama samaran : Conan Edogawa \n" +
                                   "Detektif SMA terkenal dari SMU Teitan, dan sering disebut \"Detektif dari timur\" \n" +
                                   "ia menjadi kecil ketika ia sedang meilhat kasus transaksi ilegal \n" +
                                   "oleh gin dan vodka, lalu meminumkan obat yang bernama APTK 4869 kepada shinichi \n" +
                                   "Ia tinggal bersama Ran dan Kogoro Mouri, dan sekaligus mencari tahu tentang Organisasi Hitam. \n" +
                                   "Ia juga yang membuat Kogoro disebut Kogoro tidur karena ia menidurkan Kogoro dan memecahkan \n" +
                                   "kasus lewat \"Kogoro tidur\". Identitas Conan selalu hampir diketahui oleh Ran berkali-kali. \n" +
                                   "Dan beberapa orang mengetahui identitas nya sebagai Conan. \n" +
                                   "orang orang yang mengetahui identitas conan \n" +
                                   "1. Agasa Hiroshi \n" +
                                   "2. Ai Haibara \n" +
                                   "3. Yukiko Kudo \n" +
                                   "4. Eisuke Hondo \n" +
                                   "5. Heiji Hattori \n" +
                                   "6. Kaito kid \n" +
                                   "7. Vermount \n" +
                                   "8. Akemi Miyano \n" +
                                   "9. Hiroki Sawada \n" +
                                   "10. Irish");
                break;
                
            case 9 :
                System.out.println("\n====== Ayumi Yoshida ======");
                System.out.println("- Teman conan dan menyukai conan \n" +
                                   "Ia memiliki sifat yang periang dan baik hati. \n" +
                                   "Ia juga menarik perhatian Mitsuhiko dan Genta. Paling suka sama yang namanya pencarian \n" +
                                   "harta karun dan setiap mendengar itu, Ayumi, Genta, Mitsuhiko langsung bersemangat untuk mencarinya.");
                break;
                
            case 10 :
                System.out.println("\n====== Ai Haibara ======");
                System.out.println("- Membantu Conan mengetahui tentang organisasi hitam \n" +
                                   "Ai sebenarnya bukan anak yang berumur 7 tahun biasa sama seperti Conan. Ia sebenarnya adalah \n" +
                                   "salah satu Anggota Organisasi Hitam yang berkhianat karena kakaknya, Akemi Miyano dibunuh oleh Gin. \n" +
                                   "Nama asli Ai adalah Shiho Miyano dan disebut Sherry dalam Organisasi. Ia juga yang membuat racun yang \n" +
                                   "mengecilkan tubuh Shinichi, yaitu APTX 4869. Ia juga mengecil dengan meminum racun tersebut dan untuk \n" + 
                                   "lari dari Organisasi yang akan membunuhnya nanti. Sekarang, ia tinggal bersama Professor Agasa. Kehadirannya \n" + 
                                   "juga membuat Conan terbantu dalam mengetahui tentang Organisasi Hitam.");
                break;
                
            case 11 :
                System.out.println("\n====== Mitsuhiko Tsuburaya ======");
                System.out.println("- Awalnya menyukai Ayumi \n" +
                                   "- Ketika Ai Haibara muncul, ia menaruh hati kepada Ai Haibara \n" +
                                   "Teman Conan yang memiliki pengetahuan yang melebihi kelas 1 sd. Penyuka teknologi. Awalnya ia menyukai Ayumi. \n" +
                                   "Ketika Ai muncul, ia menaruh hati juga kepada Ai dan sering cemburu karena Ai selalu dekat dengan Conan.");
                break;
                
            case 12 :
                System.out.println("\n====== Genta Kojima ======");
                System.out.println("Orang yang otaknya selalu dipenuhi dengan makanan. \n" +
                                   "Awalnya ia berkata Conan adalah pengikutnya, tetapi setelahnya ia tidak pernah mengatakan hal itu.");
                break;
                
            case 13 :
                System.out.println("\n====== Agasa Hiroshi ======");
                System.out.println("- Mengadopsi Ai Haibara \n" +
                                   "- Membantu membuatkan peralatan canggih untuk conan \n" +
                                   "Professor yang rumahnya dekat dengan rumah Shinichi. Ketika ia bertemu Shinichi yang tubuhnya menjadi kecil, \n" +
                                   "awalnya ia tidak mempercayai itu adalah Shinichi. Tetapi akhirnya ia percaya. Ia yang menciptakan berbagai \n" +
                                   "macam peralatan canggih yang dipakai Conan yang dapat berguna sewaktu-waktu ketika Conan membutuhkannya. \n" +
                                   "Ia yang menemukan Ai yang pingsan didepan rumah Shinichi lalu mengadopsinya.");
                break;
                
            case 99 :
                System.out.println("\n====== List Detective ======");
                System.out.println("1. Conan Edogawa \n" +
                                   "2. Kogoro Mouri \n" +
                                   "3. Heiji Hattori");
                break;
                
            case 00 :
                System.out.println("\n====== List Black Organization ======");
                System.out.println("1.  Gin (Boss)\n" +
                                   "2. Vodka\n" +
                                   "3. Vermouth\n" +
                                   "4. Chianti & Korn");
                break;    
        }
    }
}
