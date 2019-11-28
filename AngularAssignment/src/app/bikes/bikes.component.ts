import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  selectedBike;
  Bikes = [
    {
      imgURL : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      name : 'BMW',
      model : 'Model:1945',
      // tslint:disable-next-line: max-line-length
      details : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.',
    },
{
      imgURL : 'https://cdn.pixabay.com/photo/2014/04/23/20/34/dirt-bike-330815__340.jpg',
      name : 'Suzuki',
      model : 'Model:1885',
      // tslint:disable-next-line: max-line-length
      details : 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.',
    },
{
      imgURL : 'https://cdn.pixabay.com/photo/2015/09/08/21/02/superbike-930715__340.jpg',
      name : 'Kawasaki',
      model : 'Model:2010',
      // tslint:disable-next-line: max-line-length
      details : 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.',
    },
{
      imgURL : 'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865__340.jpg',
      name : 'RE Interceptor',
      model : 'Model:2017',
      // tslint:disable-next-line: max-line-length
      details : 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.',
    },
{
      imgURL : 'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
      name : 'Bugati',
      model : 'Model:2015',
      // tslint:disable-next-line: max-line-length
      details : 'The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl. The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.',
    },
{
      imgURL : 'https://cdn.pixabay.com/photo/2016/03/27/17/59/vintage-1283299__340.jpg',
      name : 'Audi',
      model : 'Model:2015',
      // tslint:disable-next-line: max-line-length
      details :  'Audi A3 Variants & Price: The Audi A3 is available in two variants: Premium Plus and Technology, priced from Rs 28.99 lakh to 31.99 lakh (ex-showroom pan-India). Audi A3 Engines: The A3 comes with a 1.4-litre TFSI turbocharged petrol engine that makes 150PS of power and 250Nm.',
    },
{
      imgURL : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      name : 'RE Classic 350',
      model : 'Model:2019',
      // tslint:disable-next-line: max-line-length
      details : 'The RE Classic 350, replacement for the F12berlinetta, is one of the few exotic cars still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and the engine sound is exquisite.',
    },
{
      imgURL : 'https://cdn.pixabay.com/photo/2015/11/07/11/18/moped-1031006__340.jpg',
      name : 'Bajaj',
      model : 'Model:2010',
      // tslint:disable-next-line: max-line-length
      details : 'The Bajaj is a one-off supercar based on the Chiron. Unveiled at the 2010 Geneva Motor Show, it joins the Divo as a derivative from the already famous Chiron hypercar. The La Voiture Noire is a modern reinterpretation of the Type 57 SC Atlantic from the 1930s.',
    },
{
      imgURL : 'https://cdn.pixabay.com/photo/2017/07/17/05/45/harley-2511451__340.jpg',
      name : 'Scavenger',
      model : 'Model:2014',
      // tslint:disable-next-line: max-line-length
      details : 'The Scavenger has 2 Diesel Engine and 2 Petrol Engine on offer. Depending upon the variant and fuel type the E-Class has a mileage of 10.98 to 18.0 kmpl. The E-Class is a 5 seater Sedan and has a length of 4988mm, width of 1907mm and a wheelbase of 2939mm.',
    },
{
      imgURL : 'https://cdn.pixabay.com/photo/2017/07/01/03/47/bike-2460493__340.jpg',
      name : 'Gixer SF',
      model : 'Model:2015',
      // tslint:disable-next-line: max-line-length
      details : 'Specs overview. Engine. 2.5-liter five-cylinder. Horsepower. 394. Acceleration (0—60 mph) 3.9 seconds. Torque (lb-ft @ rpm) 354. Transmission. Seven-speed S tronic® dual-clutch automatic transmission and quattro® all-wheel drive. Top speed. 155 mph 7. Valvetrain. 20-valve DOHC with Audi valvelift. Combined mpg.',
    }

  ];

constructor() { }

ngOnInit() {
  }
  sendBike(bike) {
    console.log(bike);
    this.selectedBike = bike;
  }
}
