# Dependency

- Kita menambahkan dependency baru `gson`
- dan buat class Person
- Dependency gson adalah third party atau library orang lain, dengan maven kita dipermudah untuk menggunakan library orang lain untuk mendukung aplikasi buatan kita

# Repository

- kita juga bisa menambahkan repository sendiri
- Repository ini adalah lokasi dimana si JAR itu tersedia
- Saat kita melakukan dependency management di maven, maka si maven itu akan mencari di Repository
- Repository nya ada banyak, seperti Maven Central
- si maven akan download dari repository, lalu akan disimpan di project kita
- Lantas bagaimana jika kita sendiri ingin menambahkan repository sendiri?
- karena defaultnya hanya repository bawaan Maven 