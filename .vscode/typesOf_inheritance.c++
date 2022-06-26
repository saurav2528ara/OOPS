// #include <iostream>
// using namespace std;

// class vehicle
// {
//     public:
//     vehicle()
//     {
//         cout<<"This is a vehicle"<<endl;
//     }
// };
// class car : public vehicle
// {
    
// };
// int main()
// {
//     car obj; 
    

// }// SINGLE INGERITANCE

// #include <iostream>
// using namespace std;

// class vehicle
// {
//     public:
//         vehicle()
//         {
//             cout<<"this is a vehicle"<<endl;
//         }
// };
// class fourWheeler
// {
//     public:
//         fourWheeler()
//         {
//             cout<<"this is a four wheeler"<<endl;
//         }
// };
// class car : public vehicle, public fourWheeler
// {
    
// };
// int main()
// {
//     car obj;
// }       //Multiple inheritance



// #include <iostream>
// using namespace std;

// // base class
// class Vehicle
// {
// public:
// 	Vehicle()
// 	{
// 	cout << "This is a Vehicle" << endl;
// 	}
// };

// // first sub_class derived from class vehicle
// class fourWheeler: public Vehicle
// { public:
// 	fourWheeler()
// 	{
// 	cout<<"Objects with 4 wheels are vehicles"<<endl;
// 	}
// };
// // sub class derived from the derived base class fourWheeler
// class Car: public fourWheeler{
// public:
// 	Car()
// 	{
// 	cout<<"Car has 4 Wheels"<<endl;
// 	}
// };

// // main function
// int main()
// {
// 	//creating object of sub class will
// 	//invoke the constructor of base classes
// 	Car obj;
// 	return 0;
// }       // Multilevel Inheritance


// C++ program to implement
// Hierarchical Inheritance
// #include <iostream>
// using namespace std;

// // base class
// class Vehicle
// {
// public:
// 	Vehicle()
// 	{
// 	cout << "This is a Vehicle" << endl;
// 	}
// };


// // first sub class
// class Car: public Vehicle
// {

// };

// // second sub class
// class Bus: public Vehicle
// {
	
// };

// // main function
// int main()
// {
// 	// creating object of sub class will
// 	// invoke the constructor of base class
// 	Car obj1;
// 	Bus obj2;
// 	return 0;
// }   // Hierarchical Inheritance



// Hybrid Inheritance

// #include <iostream>
// using namespace std;

// // base class
// class Vehicle
// {
// public:
// 	Vehicle()
// 	{
// 	cout << "This is a Vehicle" << endl;
// 	}
// };

// //base class
// class Fare
// {
// 	public:
// 	Fare()
// 	{
// 		cout<<"Fare of Vehicle\n";
// 	}
// };

// // first sub class
// class Car: public Vehicle
// {

// };

// // second sub class
// class Bus: public Vehicle, public Fare
// {
	
// };

// // main function
// int main()
// {
// 	// creating object of sub class will
// 	// invoke the constructor of base class
// 	Bus obj2;
// 	return 0;
// }       //Hybrid Inheritance 
