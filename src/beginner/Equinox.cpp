#include <bits/stdc++.h>
#include <string>
using namespace std;
int main()
{
    int T;
    cin >> T;
    while (T-- > 0)
    {
        long int N, A, B;
        long int sp = 0;
        long int ap = 0;
        cin >> N >> A >> B;
        string s[N];
        for (int i = 0; i < N; i++)
            cin >> s[i];
        for (int i = 0; i < N; i++)
            if (s[i][0] == 'E' || s[i][0] == 'Q' || s[i][0] == 'U' || s[i][0] == 'I' || s[i][0] == 'N' || s[i][0] == 'O' || s[i][0] == 'X')
                sp += A;
            else
                ap += B;
        if (sp > ap)
            cout << "SARTHAK" << endl;
        else if (sp < ap)
            cout << "ANURADHA" << endl;
        else
            cout << "DRAW" << endl;
    }
    return 0;
}