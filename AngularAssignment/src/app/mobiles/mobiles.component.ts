import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {
Mobiles = [
  {
    name : 'Redmi MI4A',
    imgURL : 'https://cdn.pixabay.com/photo/2016/11/29/12/30/android-1869510__340.jpg',
    rs : '25666',
    // tslint:disable-next-line: max-line-length
    details : 'Redmi 4A X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',

  },
  {
    name : 'Asus Zenfone',
    imgURL : 'https://cdn.pixabay.com/photo/2016/11/10/16/18/android-1814600__340.jpg',
    rs : '14999',
    // tslint:disable-next-line: max-line-length
    details : 'ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',

  },
  {
    name : 'Samsung s5',
    imgURL : 'https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg',
    rs : '35999',
    // tslint:disable-next-line: max-line-length
    details : 'Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.',

  },
  {
    name : 'Iphone 5',
    imgURL : 'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
    rs : '41999',
    // tslint:disable-next-line: max-line-length
    details : 'Iphone 5 Crafted From Brushed Aluminium. Laptop W/ Intel Core. Shop Today! Sennheiser Headset @ 299. Get 3Yr Premium Support. Cash off on MS Office. Get Warranty Worth@₹3999. Amenities: Dell Power Companion, Dell Bluetooth Mouse.',

  },
  {
    name : 'Samsung s6 edge',
    imgURL : 'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938__340.jpg',
    rs : '53000',
    // tslint:disable-next-line: max-line-length
    details : 'Samsung s6 edge X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',

  }
];
  selectedMobile: any;
  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile) {
    console.log(mobile);
    this.selectedMobile = mobile;
  }
}
