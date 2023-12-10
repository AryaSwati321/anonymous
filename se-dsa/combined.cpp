#include<bits/stdc++.h>
#include<string.h>
using namespace std ;
struct student{
int roll ;
float sgpa ;
string name ;
};
int partition(student s[],int left ,int right){
student pivot ,temp;
pivot=s[left];
int Pos_pivot =left ;
while(left<right){
while((s[right].sgpa<pivot.sgpa)&&(left<right)){
right--;
while((s[left].sgpa>=pivot.sgpa)&&(left<right)){
left--;
if(left<right){
temp = s[right] ;
s[right]=s[left];
s[left] = temp;
}
}
}
}
if(Pos_pivot != right){
s[Pos_pivot]=s[right];
s[right]=pivot;
}
return right ;
}
void quicksort(student s[],int low,int high){
int pivot = partition(s, low ,high);
if(low<pivot){
quicksort(s,low,pivot-1);
}
if(high>pivot){
quicksort(s,pivot+1,high);
}
}
void displayName(struct student s[],int size){
for (int i = 0 ;i<size;i++){
cout<<s[i].name<<endl;
}
}
int linear(student arr[],int size,int x){
for(int i = 0 ;i<size;i++){
if(x == arr[i].roll){
return i;
}
}return -1;
}
int linearr(student arr[],int size,float x){
for(int i = 0 ;i<size;i++){
if(x == arr[i].sgpa){
return i;
}
}return -1;
}
int binary(struct student arr[],int size, int s,int e,int x){
int mid = (s+e)/2;
if((arr[mid].roll)==e){
return mid ;
}
else if(arr[mid].roll>x)
{
e = mid-1;
}
else{
s = mid+1;
}
return -1 ;
}
void bubble (struct student arr[],int size){
int counter =1 ;
for(int i =0 ;i<size-1;i++){
for(int j = 0 ;j<size-1;j++){
if(arr[j].roll>arr[j+1].roll){
int temp = arr[j].roll;
arr[j].roll=arr[j+1].roll;
arr[j+1].roll = temp ;
} }
}
}
void insertion(student arr[],int size){
for(int step = 1 ; step<size ;step++){
int key = arr[step].roll;
int j = step - 1;
while(key<arr[j].roll && j>=0){
arr[j+1].roll=arr[j].roll;
--j;
}
arr[j+1].roll=key;
}
}
void putdata(student s[],int n){
cout<<"Enter your name : ";
cin>>s[n].name;
cout<<"\nEnter your roll no : ";
cin>>s[n].roll;
cout<<"\nEnter your sgpa : ";
cin>>s[n].sgpa;
}
void getdata(student s[] , int n){
cout<<"Your name is : "<<s[n].name<<"\nYour roll no is : "<<s[n].roll<<"\nYour sgpa is : "<<s[n].sgpa;
}
void displayr(student s[],int size){
for(int i = 0 ; i<size;i++){
cout<<"\n"<<s[i].roll;
}
}
int main(){
int record ;
cout<<"Enter number of record : ";
cin>>record;
struct student s[record];
int k = 0;
int acc=-1;
int search = 0;
while(acc != 0){
cout<<"\nMenu is here "<<endl;
cout<<"1.Put ur details"<<endl;
cout<<"2.Get ur details"<<endl;
cout<<"3.Sort ur bubble roll no"<<endl;
cout<<"4.Display ur roll no"<<endl;
cout<<"5.Sort using insert"<<endl;
cout<<"6.Search an element"<<endl;
cout<<"7.Search SGPA "<<endl;
cout<<"0.Exit"<<endl;
cout<<"Enter option : ";
cin>>acc;
switch(acc)
{
case 0:
break;
case 1 :
if(k<=record){
putdata(s,k);
k+=1;
}
else{
cout<<"Number of record are over";
}
break;
case 2 :
int rank;
cout<<"\nEnter you number : ";
cin>>rank;
getdata(s,rank);
break;
case 3 :
bubble(s,record);
break;
case 4 :
displayr(s,k);
break;
case 5 :
insertion(s,record);
break;
case 6 :
{cout<<"Enter roll number to search : ";
cin>>search;
int searchmate = linear(s,3,search);
searchmate!=-1?cout<<"Found at : "<<searchmate<<"\n\n":cout<<"Not found";
if(searchmate!=-1){
getdata(s,searchmate);
}
break;}
case 7 :{
float g ;
cout<<"Search SGPA : ";
cin>>g;
int index = linearr(s,k,g);
index!=-1?cout<<"Found at "<<index<<"\n\n":cout<<"Not found";
if(index!=-1){
getdata(s,index);
}
break;
}
default :
{
cout<<"Wrong option!!!enter correct option "<<endl;
}
}
}}
