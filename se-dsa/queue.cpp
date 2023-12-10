#include<bits/stdc++.h>
#define Max 5
using namespace std ;
class Queue{
public:
int front,rear,size,Q[Max];
Queue(int s ){
front = 0 ;rear=-1;
size=s;
}
void Enqueue(int data);
void Dequeue();
bool is_Full();
bool is_Empty();
void display();
};
bool Queue::is_Empty(){
if(rear==-1){
return true;
}
else{
return false;
}
}
bool Queue::is_Full(){
if(rear!=-1&&front==(rear+1)%Max){
return true;
}
else{
return false;
}
}
void Queue::Enqueue(int data){
if(is_Full()){
cout<<"Queue is Full!!";
}
else{
rear+=1;
Q[rear]=data;
}
}
void Queue::Dequeue(){
if(!is_Empty()){
Q[front]=-1;
front+=1;
if(front==(rear+1)%Max){
front = 0;
rear=-1;
}
}}
void Queue::display(){
for(int i = front;i<rear+1;i++){
cout<<Q[i]<<endl;
}
}
int main(){
Queue Q(10);
int choice ,element,count;
count=0;
char ans='0';
do{
cout<<"\n1.Add an element \n2.Remove an element \n3.Display queue \n4.Exit\n";
cout<<"Enter your choice : ";
cin>>choice;
switch(choice){
case 1:
cout<<"Enter your element : ";
cin>>element;
Q.Enqueue(element);
break;
case 2:
Q.Dequeue();
break;
case 3:
Q.display();
break;
case 4:
cout<<"Enter y or Y to exit : ";
cin>>ans;
break;
}
}while(ans!='y'||ans!='Y');
}

