#include <bits/stdc++.h>
using namespace std;
void reverse(string &str)
{
int size = (str.size()) / 2;
for (int i = 0; i < size; i++)
{
swap(str[i], str[(str.size()) - 1 - i]);
}
}
int prec(char s)
{
if (s == '^')
{
return 3;
}
else if (s == '*' || s == '/')
{
return 2;
}
else if (s == '+' || s == '-')
{
return 1;
}
else
{
return -1;
}
}
string Postfix(string str)
{
stack<char> s;
string result;
for (int i = 0; i < str.length(); i++)
{
char c = str[i];
if ((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i]
<= 'z') || (str[i] >= '0' && str[i] <= '9'))
{
result += c;
}
else if (c == '(')
{
s.push(c);
}
else if (c == ')')
{
while (s.top() != '(')
{
result += s.top();
s.pop();
}
s.pop();
}
else
{
while (!s.empty() && prec(str[i]) <= prec(s.top()))
{
result += s.top();
s.pop();
}
s.push(c);
}
}
while (!s.empty())
{
result += s.top();
s.pop();
}
return result ;
}
string Prefix(string str)
{
reverse(str);
stack<char> s;
string result;
for (int i = 0; i < str.length(); i++)
{
char c = str[i];
if ((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i]
<= 'z') || (str[i] >= '0' && str[i] <= '9'))
{
result += c;
}
else if (c == ')')
{
s.push(c);
}
else if (c == '(')
{
while (s.top() != ')')
{
result += s.top();
s.pop();
}
s.pop();
}
else
{
while (!s.empty() && prec(str[i]) <= prec(s.top()))
{
result += s.top();
s.pop();
}
s.push(c);
}
}
while (!s.empty())
{
result += s.top();
s.pop();
}
reverse(result);
return result;
}
int PostEva(string str)
{
stack<int> s;
int size = str.length();
int result = 0;
for (int i = 0; i < size; i++)
{
if (isdigit(str[i]))
{
s.push(str[i] - '0');
}
else
{
int val1 = s.top();
s.pop();
int val2 = s.top();
s.pop();
switch (str[i])
{
case '+':
result = val2 + val1;
s.push(result);
break;
case '-':
result = val2 - val1;
s.push(result);
break;
case '*':
result = val2 * val1;
s.push(result);
break;
case '/':
result = val2 / val1;
s.push(result);
break;
case '^':
result = pow(val2, val1);
s.push(result);
break;
default:
break;
}
}
}
return result;
}
int PreEva(string str)
{
stack<int> s;
reverse(str);
int size = str.length();
int result = 0;
for (int i = 0; i < size; i++)
{
if (isdigit(str[i]))
{
s.push(str[i] - '0');
}
else
{
int val1 = s.top();
s.pop();
int val2 = s.top();
s.pop();
switch (str[i])
{
case '+':
result = val2 + val1;
s.push(result);
break;
case '-':
result = val2 - val1;
s.push(result);
break;
case '*':
result = val2 * val1;
s.push(result);
break;
case '/':
result = val2 / val1;
s.push(result);
break;
case '^':
result = pow(val2, val1);
s.push(result);
break;
default:
break;
}
}
}
return result;
}
int main()
{
int choice=-1;
string str;
while(choice!=0){
cout<<"\n0.Exit\n";
cout<<"1.Enter Infix to Postfix\n";
cout<<"2.Enter Infix to Prefix\n";
cout<<"3.Postfix Evaluation\n";
cout<<"4.Prefix Evaluation\n";
cout<<"5.Infix Evaluation\n";
cout<<"Enter your choice : ";
cin>>choice;
switch(choice){
case 1:
cout<<"Enter your Infix : ";
cin>>str;
cout<<Postfix(str);
break;
case 2:
cout<<"Enter your Infix : ";
cin>>str;
cout<<Prefix(str);
break;
case 3:
cout<<"Enter your Postfix : ";
cin>>str;
cout<<PostEva(str);
break;
case 4:
cout<<"Enter your Prefix : ";
cin>>str;
cout<<PreEva(str);
break;
case 5 :
cout<<"Enter your infix : ";
cin>>str;
cout<<PostEva(Postfix(str));
break;
}
}
cout<<"\nYou are out of program";
return 0;
}
