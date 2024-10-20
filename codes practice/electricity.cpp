#include <iostream>
#include <string>

using namespace std;

class elect_bill
{
    int consumer_no;
    string consumer_name;
    int previous_reading;
    int current_reading;
    string connection_type;
    double bill_amt; 

public:
    elect_bill()
    {
        cout << "Enter the consumer no. : ";
        cin >> consumer_no;
        cout << "Enter the consumer name : ";
        cin>>consumer_name;
        cout << "Enter the previous reading : ";
        cin >> previous_reading;
        cout << "Enter the current reading : ";
        cin >> current_reading;
        cout << "Enter the connection type(domestic or commercial) : ";
        cin >> connection_type; 
    }

    void calculate_bill()
    {
        int units = (current_reading - previous_reading);
        if (connection_type == "domestic")
        {
            if (units <= 100)
            {
                bill_amt = units * 1.0; 
            }
            else if (units > 100 && units <= 200)
            {
                bill_amt = units * 2.50;
            }
            else if(units>200 && units<=500)
            {
                bill_amt = units*4.0;
            }
            else if(units>500)
            {
                bill_amt = units*7;
            }
        }
        if (connection_type == "commercial")
        {
            if (units <= 100)
            {
                bill_amt = units * 2.0; 
            }
            else if (units > 100 && units <= 200)
            {
                bill_amt = units * 4.50;
            }
            else if(units>200 && units<=500)
            {
                bill_amt = units*6.0;
            }
            else if(units>500)
            {
                bill_amt = units*7.0;
            }
        }
    }

    void display_bill()
    {
        cout << "Bill amount: " << bill_amt << endl;
    }
};

int main()
{
    elect_bill obj;
    obj.calculate_bill();
    obj.display_bill();
    return 0;
}