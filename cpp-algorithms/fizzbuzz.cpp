#include <iostream>
#include <vector>
#include <string>
#include <cassert>
using namespace std;

class FizzBuzz {
public:
    vector<string> fizzbuzz(int n){
        vector<string> fizzBuzz;

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0)
                fizzBuzz.push_back("FizzBuzz");
            else if(i % 3 == 0)
                fizzBuzz.push_back("Fizz");
            else if(i % 5 == 0)
                fizzBuzz.push_back("Buzz");
            else
                fizzBuzz.push_back(to_string(i));
        }

        return fizzBuzz;
    }
};

int main() {
    FizzBuzz fb;
    int n = 15;
    vector<string> expected = {
        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
        "11", "Fizz", "13", "14", "FizzBuzz"
    };
    vector<string> result = fb.fizzbuzz(n);
    assert(result == expected);
    cout << "Test passed!" << endl;

    return 0;
}
