# OS_-Tri-t-h-c-
Bài 4 trang 33
https://courses.uet.vnu.edu.vn/pluginfile.php/138144/mod_resource/content/0/NLH%C4%90H-Bai-4.pdf

Dữ liệu chung:
! Bát cơm (Tập dữ liệu)
! Khởi tạo semaphore đũa [5] bằng 1

do {
 wait (đũa[i] );
 wait (đũa[ (i + 1) % 5] );
 // eat
 signal (đũa[i] );
 signal (đũa[ (i + 1) % 5] );
 // think
} while (TRUE); 
