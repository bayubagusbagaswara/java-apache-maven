# Multi Module Project

- Pertama, kita bikin Konfigurasi Modul pom.xml di tiap module nya. Perlu tentukan parent nya siapa, dan tambahkan artifactId sesuai dengan nama module nya
- Setelah konfigurasi selesai, kita pindahkan source code ke module
- Jika antar module ada yang saling ketergantungan, maka kita harus tambahkan didalam depencdency nya
- Lalu kita assembly `mvn clean package assembly:single`
- Hasil assembly tergantung letak dari Main class kita
- target/maven-app-1.0-SNAPSHOT-jar-with-dependencies.jar
- Jalankan hasil assembly nya `java -jar maven-app/target/maven-app-1.0-SNAPSHOT-jar-with-dependencies.jar`