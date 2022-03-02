# Build Project

- ketikkan perintah di terminal `mvn clean compile test package`
- lalu kita mendapatkan file jar aplikasi kita di folder target
- file bernama `maven-project-1.0-SNAPSHOT.jar`
- file jar tersebutlah yang nanti akan dirunning di server
- untuk mencoba running file cukup tulis perintah `java -jar target/maven-project-1.0-SNAPSHOT.jar`
- tapi kita harus setting main class nya