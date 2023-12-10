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

void bubble(student s[20], int n)
{
    for (int i = 0; i < n - 1; i++)
     {
        for (int j = 0; j < n - 1; j++) 
        {
            if (s[j].Roll_No > s[j + 1].Roll_No) 
            {
                swap(s[j], s[j + 1]);
            }
        }
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

int binarySearch(student S[20], int n, char searchName[20]) {
    int Low = 0, High = n - 1, Mid;

    while (Low <= High) {
        Mid = (Low + High) / 2;
        int diff = strcmp(S[Mid].Name, searchName);

        if (diff == 0) {
            return Mid; 
        } else if (diff < 0) {
            High = Mid - 1;
        } else {
            Low = Mid + 1;
        }
    }

    return -1; 
}

int main() {
    struct student S[20];
    int n, ch;
    cout << "Enter the number of records: ";
    cin >> n;

    getdata(S, n);
    putdata(S, n);

    do {
        cout << "\n1: Bubble Sort(Roll NO)\n2: Quick Sort(SGPA)\n3: Binary Search(Name)\nEnter Your Choice: ";
        cin >> ch;

        switch (ch) {
            case 1:
                bubble(S, n);
                putdata(S, n);
                break;

            case 2:
                quicksort(S, 0, n - 1);
                putdata(S, n);
                cout << "\nFirst 3 Toppers";
                cout << "\nRoll_No\tName\tSGPA";
                for (int i = 0; i < 3; i++) {
                    cout << "\n" << S[i].Roll_No << "\t" << S[i].Name << "\t" << S[i].SGPA;
                }
                break;

        
               case 3: {
                        char Name[20];
                        putdata(S, n);
                        cout << "\nEnter Name: ";
                        cin >> Name;

                        int pos = binarySearch(S, n, Name);

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
    } while (ch >= 1 && ch <= 3);

return 0;
}
