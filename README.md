LAB_WEEK_04 - Building App Navigation

Link Google Drive

Keseluruhan Project: https://drive.google.com/drive/u/5/folders/1NjVGyS2-ohesriyzoKSh1UMMbvOPNejZ

Images & Screenshots: https://drive.google.com/drive/u/5/folders/1pjHD0qTkddklMaEJUwp2pW7Rkjcgj-Tt

APK File: https://drive.google.com/drive/u/5/folders/15b6q4WZY5u6OWqoaI0opdTp9yutPb5Lr

Commit History
Commit No. 1 - Navigation drawer  
Commit No. 2 - Bottom Navigation  
Commit No. 3 - Tabbed Navigation  
Commit No. 4 - Assignment

Fitur Aplikasi
- Navigation Drawer dengan header dan menu navigasi
- Bottom Navigation untuk navigasi utama antara Coffee dan Cafe
- Tabbed Navigation dengan ViewPager2 untuk detail kafe
- Dynamic Content setiap tab menampilkan deskripsi kafe yang berbeda
- 3 Cafe Partner dengan deskripsi lengkap

Daftar Kafe
- STARBUCKS
Starbucks Corporation is an American multinational chain of coffeehouses and roastery reserves headquartered in Seattle, Washington. It is the worlds largest coffeehouse chain.
- JANJI JIWA
It is undeniable that Janji Jiwa outlets have spread to various corners. Janji Jiwa is a local coffee brand that is popular among students, workers and even families. Carrying the jargon "coffee from the heart", Janji Jiwa is committed to serving coffee with a classic taste for coffee lovers.
- KOPI KENANGAN
At Kopi Kenangan, their dream is to serve high quality coffee, made with the freshest local ingredients to customers across Indonesia - and the rest of the world.

 Teknologi yang Digunakan
- Android Studio
- Kotlin
- Navigation Drawer
- Bottom Navigation
- TabLayout & ViewPager2
- FragmentStateAdapter
- Jetpack Navigation Component

 Struktur Project
- MainActivity - Mengatur Navigation Drawer dan Bottom Navigation
- ListFragment - Menampilkan daftar coffee
- DetailFragment - Menampilkan detail coffee
- FavoritesFragment - Menampilkan coffee favorit
- CafeFragment - Menampilkan tab kafe dengan ViewPager2
- CafeAdapter - Adapter untuk ViewPager2
- CafeDetailFragment - Fragment untuk menampilkan detail kafe

 Cara Penggunaan
1. Navigation Drawer: Geser dari kiri untuk mengakses menu navigasi
2. Bottom Navigation: Gunakan bottom bar untuk berpindah antara "Coffee" dan "Cafe"
3. Tab Navigation: Pada halaman Cafe, gunakan tab untuk berpindah antara Starbucks, Janji Jiwa, dan Kopi Kenangan
4. Swipe Gesture: Geser layar kiri/kanan untuk berpindah tab kafe
5. Setiap tab menampilkan deskripsi lengkap tentang kafe tersebut
