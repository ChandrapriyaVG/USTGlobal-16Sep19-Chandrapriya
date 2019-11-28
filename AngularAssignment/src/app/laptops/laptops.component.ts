import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})
export class LaptopsComponent implements OnInit {
  selectedLaptop;

  Laptops = [
    {
      name: 'Dell Vostro',
      imgURL: 'https://cdn.pixabay.com/photo/2017/08/10/07/32/dell-2619501__340.jpg',
      rs: 'Rs 34000',
      // tslint:disable-next-line: max-line-length
      details: 'Dell 15 7000 Crafted From Brushed Aluminium. Laptop W/ Intel Core. Shop Today! Sennheiser Headset @ 299. Get 3Yr Premium Support. Cash off on MS Office. Get Warranty Worth@₹3999. Amenities: Dell Power Companion, Dell Bluetooth Mouse.',
    },
    {
      name: 'Apple Macbook Air',
      imgURL: 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
      rs: 'Rs 59999',
      // tslint:disable-next-line: max-line-length
      details: '2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.',
    },
    {
      name: 'Toshiba',
      // tslint:disable-next-line: max-line-length
      imgURL: 'https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/TOSHIBA_Satellite_Pro_L850/TOSHIBA_Satellite_Pro_L850_L_1.jpg',
      rs: 'Rs 35000',
      // tslint:disable-next-line: max-line-length
      details: 'This item 2015 Toshiba Satellite 15.6-inch Laptop- 5th Gen Intel Core i7-5500U Processor 3.0GHz, 4MB Cache, 8GB Memory, 1TB HDD, HDMI, Bluetooth, Webcam, WIFI, AMD R7 M260, Windows 8.1/Windows 10.',
    },
    {
      name: 'Asus Pavillion',
      imgURL: 'https://cdn.pixabay.com/photo/2018/03/01/09/33/laptop-3190194__340.jpg',
      rs: 'Rs 53000',
      // tslint:disable-next-line: max-line-length
      details: 'ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    },
    {
      name: 'Acer',
      imgURL: 'https://cdn.pixabay.com/photo/2015/05/31/10/51/acer-791027__340.jpg',
      rs: 'Rs 24999',
      // tslint:disable-next-line: max-line-length
      details: 'Comes W/ Infinity Edge IPS Display. Laptops W/ Intel® Core™ Processor, Buy Now! Cash off on MS Office. Get 3Yr Hardware Warranty. Get 3Yr Premium Support. Amenities: Dell Pro Backpack, Dell Bluetooth Mouse, Dell Professional Headset, Accidental Damage Service.',
    },
  ];
  constructor() { }

  ngOnInit() {
  }
  sendLaptop(laptop) {
    console.log(laptop);
    this.selectedLaptop = laptop;
  }

}
