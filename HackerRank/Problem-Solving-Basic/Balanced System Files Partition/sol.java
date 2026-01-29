long sum = 0;
for (int x : nums) {
sum += x;
}

long res = Long.MAX_VALUE;
long left = 0;

for (int i = 0; i < nums.length - 1; i++) {
left += nums[i];
long right = sum - left;
res = Math.min(res, Math.abs(left - right));
}
System.out.println(res);
