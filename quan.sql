-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 29, 2023 lúc 11:21 AM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quan`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `maHoaDon` int(11) NOT NULL,
  `maChiTietSanPham` int(11) NOT NULL,
  `soLuong` int(11) DEFAULT NULL,
  `giaTien` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitiethoadon`
--

INSERT INTO `chitiethoadon` (`maHoaDon`, `maChiTietSanPham`, `soLuong`, `giaTien`) VALUES
(11, 2, 1, '175,000'),
(15, 2, 6, '175,000'),
(15, 6, 3, '975,000'),
(17, 2, 1, '175,000'),
(17, 6, 9, '975,000'),
(21, 2, 1, '175,000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietkhuyenmai`
--

CREATE TABLE `chitietkhuyenmai` (
  `maKhuyenMai` int(11) NOT NULL,
  `masanpham` int(11) NOT NULL,
  `giamGia` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietsanpham`
--

CREATE TABLE `chitietsanpham` (
  `maChiTietSanPham` int(11) NOT NULL,
  `maSanPham` int(11) DEFAULT NULL,
  `maSize` int(11) DEFAULT NULL,
  `maMau` int(11) DEFAULT NULL,
  `soLuong` int(11) DEFAULT NULL,
  `ngayNhap` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietsanpham`
--

INSERT INTO `chitietsanpham` (`maChiTietSanPham`, `maSanPham`, `maSize`, `maMau`, `soLuong`, `ngayNhap`) VALUES
(1, 3, 1, 1, 21, '13/3/2023'),
(2, 4, 1, 1, 11, '13/3/2023'),
(3, 5, 2, 2, 21, '13/3/2023'),
(4, 6, 3, 3, 11, '13/3/2023'),
(5, 7, 2, 2, 11, '13/3/2023'),
(6, 8, 3, 4, 61, '13/3/2023'),
(7, 9, 2, 5, 10, '13/3/2023'),
(8, 10, 3, 2, 1, '13/3/2023'),
(9, 11, 2, 3, 10, '13/3/2023'),
(10, 12, 3, 5, 1, '13/3/2023'),
(11, 13, 2, 1, 10, '13/3/2023'),
(12, 14, 3, 1, 1, '13/3/2023'),
(13, 15, 2, 2, 20, '13/3/2023'),
(14, 16, 5, 6, 100, '13/3/2023'),
(15, 17, 2, 7, 20, '13/3/2023'),
(16, 18, 5, 1, 100, '13/3/2023'),
(17, 19, 2, 8, 20, '13/3/2023'),
(18, 20, 5, 6, 17, '13/3/2023'),
(19, 20, 4, 7, 20, '13/3/2023'),
(20, 19, 1, 1, 11, '13/3/2023'),
(21, 18, 4, 2, 1, '13/3/2023'),
(22, 17, 4, 3, 2, '13/3/2023'),
(23, 16, 1, 3, 10, '13/3/2023'),
(24, 15, 2, 6, 2, '13/3/2023'),
(26, 13, 2, 7, 10, '13/3/2023'),
(27, 13, 2, 3, 10, '13/3/2023'),
(29, 13, 2, 8, 10, '13/3/2023'),
(30, 12, 3, 3, 1, '13/3/2023'),
(31, 11, 2, 6, 10, '13/3/2023'),
(32, 10, 3, 6, 1, '13/3/2023'),
(33, 9, 2, 1, 10, '13/3/2023'),
(34, 8, 3, 8, 61, '13/3/2023'),
(35, 7, 2, 5, 11, '13/3/2023'),
(36, 6, 3, 6, 11, '13/3/2023'),
(37, 5, 2, 7, 21, '13/3/2023'),
(38, 4, 1, 5, 11, '13/3/2023'),
(39, 3, 1, 6, 21, '13/3/2023');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `maChucVu` int(11) NOT NULL,
  `tenChucVu` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chucvu`
--

INSERT INTO `chucvu` (`maChucVu`, `tenChucVu`) VALUES
(1, 'Admin'),
(2, 'user'),
(3, 'user');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `danhmucsanpham`
--

CREATE TABLE `danhmucsanpham` (
  `maDanhMuc` int(11) NOT NULL,
  `tenDanhMuc` varchar(100) DEFAULT NULL,
  `hinhDanhMuc` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `danhmucsanpham`
--

INSERT INTO `danhmucsanpham` (`maDanhMuc`, `tenDanhMuc`, `hinhDanhMuc`) VALUES
(1, 'Đồ Của Nữ', '[value-3]'),
(2, 'Đồ Của Nam', '[value-3]');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `maHoaDon` int(11) NOT NULL,
  `tenKhachHang` varchar(100) DEFAULT NULL,
  `soDT` char(12) DEFAULT NULL,
  `diaChiGiaoHang` varchar(150) DEFAULT NULL,
  `tinhTrang` tinyint(4) DEFAULT NULL,
  `ngayLap` varchar(50) DEFAULT NULL,
  `ghiChu` text DEFAULT NULL,
  `phuongThucThanhToan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`maHoaDon`, `tenKhachHang`, `soDT`, `diaChiGiaoHang`, `tinhTrang`, `ngayLap`, `ghiChu`, `phuongThucThanhToan`) VALUES
(11, 'dfghj', '741451', 'cvbnm', NULL, NULL, '', 'COD'),
(15, 'luu cung quan ', '0362011615', 'hai duong', NULL, NULL, 'dfghjk,', 'Bank transfer'),
(17, 'oanh', '02398274', 'ha nam', NULL, NULL, 'cgjkl', 'COD'),
(18, 'dfghj', '123456', 'dfgnm,', NULL, NULL, 'dfghjk', 'COD'),
(19, 'fghm', '12345678', 'cghj,', NULL, NULL, 'fghjk', 'COD'),
(20, 'áº¡g', '12345', 'adjfga', NULL, NULL, '', 'COD'),
(21, 'hoai', '4289794', 'thanhhoa', NULL, NULL, '', 'COD');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khuyenmai`
--

CREATE TABLE `khuyenmai` (
  `maKhuyenMai` int(11) NOT NULL,
  `tenKhuyenMai` varchar(150) DEFAULT NULL,
  `thoiGianBatDau` varchar(50) DEFAULT NULL,
  `thoiGianKetThuc` varchar(50) DEFAULT NULL,
  `mota` text DEFAULT NULL,
  `hinhKhuyenMai` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `mausanpham`
--

CREATE TABLE `mausanpham` (
  `maMau` int(11) NOT NULL,
  `tenMau` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `mausanpham`
--

INSERT INTO `mausanpham` (`maMau`, `tenMau`) VALUES
(1, 'Trắng'),
(2, 'Đen'),
(3, 'Hồng'),
(4, 'Nâu'),
(5, 'Xanh Dương'),
(6, 'Đỏ'),
(7, 'Vàng'),
(8, 'Lòe Loẹt');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNhanVien` int(11) NOT NULL,
  `hoTen` varchar(30) DEFAULT NULL,
  `diaChi` varchar(200) DEFAULT NULL,
  `gioiTinh` tinyint(4) DEFAULT NULL,
  `cmnd` char(14) DEFAULT NULL,
  `maChucVu` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `tenDangNhap` varchar(50) DEFAULT NULL,
  `matKhau` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`maNhanVien`, `hoTen`, `diaChi`, `gioiTinh`, `cmnd`, `maChucVu`, `email`, `tenDangNhap`, `matKhau`) VALUES
(1, 'Lưu Cung Quân', 'Xóm 1 Thanh Hà Hải Dương', 1, '030202008136', 1, 'luucungquanth2002@gmail.com', 'luucungquan', '17062002'),
(26, NULL, NULL, 0, NULL, NULL, 'luucungquanbel12@ecorp.edu', NULL, 'Quan17062002@'),
(28, NULL, NULL, 0, NULL, NULL, 'khaitran@gmail.com', NULL, '1234567'),
(29, NULL, NULL, 0, NULL, NULL, 'phamduythang@gmail.com', NULL, '123456'),
(30, NULL, NULL, 0, NULL, NULL, 'luucungquanbel12@ecorp.edu', NULL, '17062002'),
(31, NULL, NULL, 0, NULL, NULL, 'luucungquanbel12@ecorp.edu', NULL, '17062002');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `maSanPham` int(11) NOT NULL,
  `maDanhMuc` int(11) DEFAULT NULL,
  `tenSanPham` varchar(100) DEFAULT NULL,
  `giaTien` varchar(50) DEFAULT NULL,
  `moTa` text DEFAULT NULL,
  `hinhSanPham` text DEFAULT NULL,
  `gianhCho` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`maSanPham`, `maDanhMuc`, `tenSanPham`, `giaTien`, `moTa`, `hinhSanPham`, `gianhCho`) VALUES
(3, 1, 'ÁO SƠ MI NỮ BÁNH BÈO', '200.000', 'Thiết kế đơn giản  và phù hợp với các công chúa', 'pexels-anh-tuan-6105874.jpg', 'Nữ'),
(4, 1, 'ÁO THUN NGẮN TRẮNG', '175,000', 'Thiết kế đơn giản và phù hợp với các bạn cá tính', 'pexels-athena-1758144.jpg', 'Nữ'),
(5, 1, 'ÁO DA', '975,000', 'Thiết kế đơn giản và phù hợp với các bạn cá tính', 'pexels-danik-prihodko-15759515.jpg', 'Nữ'),
(6, 1, 'ÁO VEST HỒNG', '1,075,000', 'Thiết kế đơn giản và phù hợp với các doanh nhân', 'pexels-kadeem-stewart-15787338.jpg', 'Nữ'),
(7, 1, 'ÁO VEST ĐEN', '1,275,000', 'Thiết kế đơn giản và phù hợp với các doanh nhân', 'pexels-kadeem-stewart-15787342.jpg', 'Nữ'),
(8, 1, 'ÁO VEST NÂU', '975,000', 'Thiết kế đơn giản và phù hợp với các doanh nhân', 'pexels-kadeem-stewart-15787343.jpg', 'Nữ'),
(9, 1, 'ÁO MILION', '875,000', 'Thiết kế đơn giản và phù hợp với các bạn cute', 'pexels-luana-freitas-15794810.jpg', 'Nữ'),
(10, 1, 'ÁO THUN ĐEN', '675,000', 'Thiết kế đơn giản và phù hợp với các bạn  cá tính', 'pexels-marcelo-dias-2010877.jpg', 'Nữ'),
(11, 1, 'VÁY HỒNG', '475,000', 'Thiết kế đơn giản và phù hợp với các bạn  cá tính', 'pexels-kadeem-stewart-15787284.jpg', 'Nữ'),
(12, 2, 'ÁO SƠ MI XANH', '475,000', 'Thiết kế đơn giản và phù hợp với các doanh nhân', 'pexels-chloe-1043474.jpg', 'Nam'),
(13, 2, 'ÁO THUN TRẮNG', '475,000 ', 'Thiết kế đơn giản và phù hợp với các bạn ', 'pexels-chris-wölfer-1561011.jpg', 'Nam'),
(14, 2, 'ÁO THUN TRẮNG', '475,000 ', 'Thiết kế đơn giản và phù hợp với các bạn ', 'pexels-edgar-serrano-1964970.jpg', 'Nam'),
(15, 2, 'ÁO THUN TRẮNG', '175,000 ', 'Thiết kế đơn giản và phù hợp với các bạn ', 'pexels-humphrey-muleba-2072453.jpg', 'Nam'),
(16, 2, 'ÁO CÓ MŨ ĐỎ', '975,000 ', 'Thiết kế đơn giản và phù hợp với các bạn trẻ', 'pexels-othmane-kniksi-15777478.jpg', 'Nam'),
(17, 2, 'ÁO THUN VÀNG', '475,000 ', 'Thiết kế đơn giản và phù hợp với các bạn trẻ ', 'pexels-raul-reynoso-1018911.jpg', 'Nam'),
(18, 2, 'ÁO THUN TRẮNG', '375,000 ', 'Thiết kế đơn giản và phù hợp với các bạn ', 'pexels-spencer-selover-775358.jpg', 'Nam'),
(19, 2, 'ÁO LÒE LOẸT', '475,000 ', 'Thiết kế đơn giản và phù hợp với các bạn yêu màu sắc ', 'pexels-uncoveredlens-eze-joshua-3620411.jpg', 'Nam'),
(20, 2, 'ÁO SƠ MI ĐỎ', '1,475,000 ', 'Thiết kế đơn giản và phù hợp với các doanh nhân ', 'pexels-yogendra-singh-1760900.jpg', 'Nam');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sizesanpham`
--

CREATE TABLE `sizesanpham` (
  `maSize` int(11) NOT NULL,
  `size` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sizesanpham`
--

INSERT INTO `sizesanpham` (`maSize`, `size`) VALUES
(1, 'S'),
(2, 'M'),
(3, 'L'),
(4, 'XL'),
(5, 'XXL');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`maHoaDon`,`maChiTietSanPham`),
  ADD KEY `Fk_chitiethoadon_chitietsanpham` (`maChiTietSanPham`);

--
-- Chỉ mục cho bảng `chitietkhuyenmai`
--
ALTER TABLE `chitietkhuyenmai`
  ADD PRIMARY KEY (`maKhuyenMai`,`masanpham`),
  ADD KEY `Fk_chitietkhuyenmai_sanpham` (`masanpham`);

--
-- Chỉ mục cho bảng `chitietsanpham`
--
ALTER TABLE `chitietsanpham`
  ADD PRIMARY KEY (`maChiTietSanPham`),
  ADD KEY `Fk_chitiet_size` (`maSize`),
  ADD KEY `Fk_chitiet_mausanpham` (`maMau`),
  ADD KEY `Fk_chitiet_sanpham` (`maSanPham`);

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`maChucVu`);

--
-- Chỉ mục cho bảng `danhmucsanpham`
--
ALTER TABLE `danhmucsanpham`
  ADD PRIMARY KEY (`maDanhMuc`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`maHoaDon`);

--
-- Chỉ mục cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD PRIMARY KEY (`maKhuyenMai`);

--
-- Chỉ mục cho bảng `mausanpham`
--
ALTER TABLE `mausanpham`
  ADD PRIMARY KEY (`maMau`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNhanVien`),
  ADD KEY `Fk_nhanvien_chucvu` (`maChucVu`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`maSanPham`),
  ADD KEY `Fk_sanpham_danhmuc` (`maDanhMuc`);

--
-- Chỉ mục cho bảng `sizesanpham`
--
ALTER TABLE `sizesanpham`
  ADD PRIMARY KEY (`maSize`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `chitietkhuyenmai`
--
ALTER TABLE `chitietkhuyenmai`
  MODIFY `maKhuyenMai` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `chitietsanpham`
--
ALTER TABLE `chitietsanpham`
  MODIFY `maChiTietSanPham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  MODIFY `maChucVu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `danhmucsanpham`
--
ALTER TABLE `danhmucsanpham`
  MODIFY `maDanhMuc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `maHoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  MODIFY `maKhuyenMai` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `mausanpham`
--
ALTER TABLE `mausanpham`
  MODIFY `maMau` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `maNhanVien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `maSanPham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT cho bảng `sizesanpham`
--
ALTER TABLE `sizesanpham`
  MODIFY `maSize` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `Fk_chitiethoadon_chitietsanpham` FOREIGN KEY (`maChiTietSanPham`) REFERENCES `chitietsanpham` (`maChiTietSanPham`),
  ADD CONSTRAINT `Fk_chitiethoadon_hoadon` FOREIGN KEY (`maHoaDon`) REFERENCES `hoadon` (`maHoaDon`);

--
-- Các ràng buộc cho bảng `chitietkhuyenmai`
--
ALTER TABLE `chitietkhuyenmai`
  ADD CONSTRAINT `Fk_chitietkhuyenmai_sanpham` FOREIGN KEY (`masanpham`) REFERENCES `sanpham` (`maSanPham`);

--
-- Các ràng buộc cho bảng `chitietsanpham`
--
ALTER TABLE `chitietsanpham`
  ADD CONSTRAINT `Fk_chitiet_mausanpham` FOREIGN KEY (`maMau`) REFERENCES `mausanpham` (`maMau`),
  ADD CONSTRAINT `Fk_chitiet_sanpham` FOREIGN KEY (`maSanPham`) REFERENCES `sanpham` (`maSanPham`),
  ADD CONSTRAINT `Fk_chitiet_size` FOREIGN KEY (`maSize`) REFERENCES `sizesanpham` (`maSize`);

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `Fk_nhanvien_chucvu` FOREIGN KEY (`maChucVu`) REFERENCES `chucvu` (`maChucVu`);

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `Fk_sanpham_danhmuc` FOREIGN KEY (`maDanhMuc`) REFERENCES `danhmucsanpham` (`maDanhMuc`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
