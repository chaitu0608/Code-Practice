#include<iostream>
#include<string>
using namespace std;
class consumer{
public:
  long int consumerNo;
  long int previousReading;
  long int currentReading;
  string name;
  string connectiontype;
  consumer(int  consumerNo,int previousReading, int currentReading,string name,string connectiontype){
    this->consumerNo= consumerNo;
    this->previousReading= previousReading;
    this->currentReading= currentReading;
    this->name=name;
    this->connectiontype=connectiontype;
  }
   int CalculateBill(string connectiontype,float a,float b ){
       long int c=b-a;
      if(connectiontype== "Domestic" || connectiontype=="DOMESTIC"){
            if(c<=100){
                c=c*1;
            }
            else if(c>101 && c<=200){
                c=c*2.5;
            }
            else if(c>201 && c<=500){
                c=c*4;
            }
            else{
                c=c*6;
            }
        return c;
      }
    if(connectiontype== "Commercial" || connectiontype=="COMERCIAL"){
            if(c<=100){
                c=c*2;
            }
            else if(c>101 && c<=200){
                c=c*4.5;
            }
            else if(c>201 && c<=500){
                c=c*6;
            }
            else{
                c=c*7;
            }
        return c;
      }

   }
};
int main(){
    long int a;
    cout<<"Enter Consumer Number : ";
    cin>>a;
    float b;
    cout<<"Enter Previous Reading : ";
    cin>>b;
    float c;
    cout<<"Enter Current Reading : ";
    cin>>c;
    string s;
    cout<<"Please enter the name of the Consumer : ";
    cin>>s;
    string t;
    cout<<"Please Enter the connection type: DOMESTIC OR COMMERCIAL??  : ";
    cin>>t;
    long int d=c-b;
    if(d<0) cout<<"INVALID READING!!!";
    else{
    cout<<"DETAILS OF:"<<s<<endl;
    cout<<"CONSUMER NUMBER: "<<a<<endl;
    cout<<"PREVIOUS READING: "<<b<<endl;
    cout<<"CURRENT READIND: "<<c<<endl;
    cout<<"NAME: "<<s<<endl;
    consumer one(a,b,c,s,t);
    cout<<"Number of Units Consumed : "<<d<<endl;
    if(t== "DOMESTIC"){
            if(d<=100){
                cout<<"The price per unit is 1 : "<<endl;
            }
            else if(d>101 && d<=200){
                cout<<"The price per unit is 2.5 : "<<endl;
            }
            else if(d>201 && d<=500){
                cout<<"The price per unit is 4 : "<<endl;
            }
            else{
               cout<<"The price per unit is 6 : "<<endl;
            }
    if(t== "Commercial"){
               if(d<=100){
                 cout<<"The price per unit is 2 : "<<endl;
            }
            else if(d>101 && d<=200){
                 cout<<"The price per unit is 4.50 : "<<endl;
            }
            else if(d>201 && d<=500){
                 cout<<"The price per unit is 6 : "<<endl;
            }
            else{
             cout<<"The price per unit is 7 : "<<endl;
            }
    }
}
  cout<<"YOUR BILL IS: "<<one.CalculateBill(t,b,c)<<" RUPEES"<<endl;
    }
}