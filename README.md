## ❤️Tugas Inheritance PBO – Implementasi Bentuk Geometris❤️
(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
---
Repositori ini berisi program Java untuk memenuhi tugas Inheritance pada mata kuliah Pemrograman Berorientasi Objek (PBO). Program ini mengimplementasikan konsep pewarisan pada objek geometris, yaitu Bentuk, Bujur Sangkar, Lingkaran, dan Silinder.

Program menyediakan dua pilihan penggunaan, yaitu menampilkan objek dengan nilai default atau memasukkan nilai sendiri melalui input pengguna. Setiap objek akan menampilkan informasi warna serta hasil perhitungan luas atau volume sesuai dengan jenis bentuknya.

---
## ⭐ Deskripsi Program ⭐
---

Program ini mengimplementasikan sistem perbankan sederhana yang terdiri dari empat class:

• Bentuk.java — Kelas induk yang menyimpan warna dan informasi dasar bentuk.

• BujurSangkar.java — Kelas turunan untuk menghitung luas bujur sangkar.

• Lingkaran.java — Kelas turunan untuk menghitung luas lingkaran.

• Silinder.java — Kelas turunan dari Lingkaran untuk menghitung volume silinder.

• Main.java — Kelas utama yang menyediakan menu dan menjalankan pengujian seluruh objek.

---
## 🐳Konsep OOP yang Digunakan🐳
---

• Encapsulation: Menggunakan atribut private pada kelas BujurSangkar, Lingkaran, dan Silinder, serta menyediakan getter dan setter untuk mengakses atau mengubah nilainya.

• Inheritance: Menggunakan extends untuk mewariskan atribut dan metode. BujurSangkar dan Lingkaran mewarisi Bentuk, sedangkan Silinder mewarisi Lingkaran.

• Polymorphism: Menggunakan method overriding pada metode printInfo() di setiap kelas turunan untuk menampilkan informasi sesuai jenis objek, seperti luas bujur sangkar, luas lingkaran, dan volume silinder.

---
## 📸 Screenshot Output Code 📸

| Menu / Fitur                            | Screenshot Output                     |
| :-------------------------------------- | :------------------------------------ |
| **1. Perlihatkan dengan nilai default** | ![Pilihan 1](OutputMenu/pilihan1.png) |
| **2. Isi nilai sendiri**                | ![Pilihan 2](OutputMenu/pilihan2.png) |
| **0. Keluar**                           | ![Pilihan 0](OutputMenu/pilihan0.png) |

