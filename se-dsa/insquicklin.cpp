#include<iostream>
#include<string.h>  
using namespace std;

struct student { 
    int Roll_No;
    char Name[20];
    float SGPA;
};

void getdata(student S[20], int n) 
{
    for (int i = 0; i < n; i++)
    {
        cout << "Enter Roll_No, Name, SGPA: ";
        cin >> S[i].Roll_No >> S[i].Name >> S[i].SGPA;
    }
}

void putdata(student S[20], int n) {
    cout << "\nRoll_No\tName\tSGPA";
    for (int i = 0; i < n; i++)
        cout << "\n" << S[i].Roll_No << "\t" << S[i].Name << "\t" << S[i].SGPA;
}

void insertion(student arr[],int size){
for(int step = 1 ; step<size ;step++){
int key = arr[step].Roll_No;
int j = step - 1;
while(key<arr[j].Roll_No && j>=0){
arr[j+1].Roll_No=arr[j].Roll_No;
--j;
}
arr[j+1].Roll_No=key;
}
}

int partition(student s[20], int left, int right) {
    float pivot = s[right].SGPA;
    int i = left - 1;

    for (int j = left; j < right; j++) {
        if (s[j].SGPA >= pivot) {
            i++;
            swap(s[i], s[j]);
        }
    }
    swap(s[i + 1], s[right]);
    return i + 1;
}

void quicksort(student s[20], int left, int right) {
    if (left < right) {
        int pivot = partition(s, left, right);
        quicksort(s, left, pivot - 1);
        quicksort(s, pivot + 1, right);
    }
}

int linear(student arr[],int size,int x){
for(int i = 0 ;i<size;i++){
if(x == arr[i].Roll_No){
return i;
}
}return -1;
}
int linearr(student arr[],int size,float x){
for(int i = 0 ;i<size;i++){
if(x == arr[i].SGPA){
return i;
}
}return -1;
}


int main() {
    struct student S[20];
    int n, ch;
    cout << "Enter the number of records: ";
    cin >> n;

    getdata(S, n);
    putdata(S, n);

    do {
        cout << "\n1: Insertion Sort(NAME)\n2: Quick Sort(SGPA)\n3: Linear Search(SGPA)\nEnter Your Choice: ";
        cin >> ch;

        switch (ch) {
            case 1:
                insertion(S, n);
                putdata(S, n);
                break;

            case 2:
                quicksort(S, 0, n - 1);
                putdata(S, n);
                cout << "\nFirst 10 Toppers";
                cout << "\nRoll_No\tName\tSGPA";
                for (int i = 0; i < 10; i++) {
                    cout << "\n" << S[i].Roll_No << "\t" << S[i].Name << "\t" << S[i].SGPA;
                }
                break;

        
               case 3: {
                        float SGPA;
                        char Name[30];
                        putdata(S, n);
                        cout << "\nEnter SGPA: ";
                        cin >> SGPA;

                        int pos = linear(S, n, SGPA);

                        if (pos == -1) {
                            cout << "Record Not Present";
                        } else {
                            cout << "\nRoll No\tName\tSGPA";
                            for (int i = pos; i < n && strcmp(S[i].Name, Name) == 0; i++) {
                                cout << "\n" << S[i].Roll_No << "\t" << S[i].Name << "\t" << S[i].SGPA;
                            }
                        }

                        break;
                    }

        }
    }
    while (ch >= 1 && ch <= 10);

return 0;
}
