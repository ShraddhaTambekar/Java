//Continue
/*
 Q)From 1 ro 100 print all number skip numbers which are divisible by (3 and 5) or 4
 */

class Demo{
    public static void main(String []args){

        for(int i = 1;i<=100;i++){
            if((i%3==0&&i%5==0)||(i%4==0)){
                continue;
            }
            System.out.println(i);
        }
    }
}

/*
1)continue skips the current iteration of loop and continue next
*/

/*
 output-
1
2
3
5
6
7
9
10
11
13
14
17
18
19
21
22
23
25
26
27
29
31
33
34
35
37
38
39
41
42
43
46
47
49
50
51
53
54
55
57
58
59
61
62
63
65
66
67
69
70
71
73
74
77
78
79
81
82
83
85
86
87
89
91
93
94
95
97
98
99
 */