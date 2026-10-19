#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;

    while (T--) {
        int N;
        cin >> N;

        int cnt[31] = {};

        for (int i = 0; i < N; ++i) {
            int x;
            cin >> x;

            int msb = 31 - __builtin_clz(x);
            cnt[msb]++;
        }

        int ans = 0;
        for (int i = 0; i < 31; ++i)
            ans = max(ans, cnt[i]);

        cout << ans << '\n';
    }

    return 0;
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna