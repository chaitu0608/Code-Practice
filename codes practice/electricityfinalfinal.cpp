#include <iostream>
#include<string>
using namespace std;

class consumer{
    public:
    long int consumer_num;
    long int prev_units;
    long int curr_units;
    string name;
    string connection_type;


    consumer(int cons, int pre, int curr, string n, string contype){
        consumer_num = cons;
        prev_units = pre;
        curr_units = curr;
        name = n;
        connection_type = contype;
    }


    void BillCalc(int pre, int curr,string contype){

        float bill;
        int x = curr - pre;

        if(contype == "domestic"){
            if(x<100){
                bill = x * 1;
            }
            else if (x>101 && x<200){
                bill = x * 2.5;
            }
            else if (x>201 && x<500){
                bill = x * 4;
            }
            else if (x>500){
                bill =  x * 6;
            }
            cout<<"Your Bill: "<<bill<<endl;
            }

            else if(contype == "commercial"){
                if(x<100){
                bill = x * 2;
            }
            else if (x>101 && x<200){
                bill = x * 4.5;
            }
            else if (x>201 && x<500){
                bill = x * 6;
            }
            else if (x>500){
                bill =  x * 7;
            }
            cout<<"Your Bill: "<<bill<<endl;
            }
        }

};

int main(){
    int cons;
    int prev;
    int curr;
    string conntype;
    string cons_name;

    cout<<"Enter the name of the Customer : ";
    cin>>cons_name;
    cout<<"Enter the Consumer Number : ";
    cin>>cons;
    cout<<"Enter the connection type- Domestic or Commercial? :  ";
    cin>>conntype;
    cout<<"Enter your Previous Readings : ";
    cin>>prev;
    cout<<"Enter your Current Readings : ";
    cin>>curr;

    consumer c1(cons, prev, curr, conntype, cons_name);
    c1.BillCalc(prev, curr, conntype);
   
return 0;
}