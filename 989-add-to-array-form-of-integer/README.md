<h2><a href="https://leetcode.com/problems/add-to-array-form-of-integer/">989. Add to Array-Form of Integer</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">The <strong style="user-select: auto;">array-form</strong> of an integer <code style="user-select: auto;">num</code> is an array representing its digits in left to right order.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, for <code style="user-select: auto;">num = 1321</code>, the array form is <code style="user-select: auto;">[1,3,2,1]</code>.</li>
</ul>

<p style="user-select: auto;">Given <code style="user-select: auto;">num</code>, the <strong style="user-select: auto;">array-form</strong> of an integer, and an integer <code style="user-select: auto;">k</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">array-form</strong> of the integer</em> <code style="user-select: auto;">num + k</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> num = [1,2,0,0], k = 34
<strong style="user-select: auto;">Output:</strong> [1,2,3,4]
<strong style="user-select: auto;">Explanation:</strong> 1200 + 34 = 1234
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> num = [2,7,4], k = 181
<strong style="user-select: auto;">Output:</strong> [4,5,5]
<strong style="user-select: auto;">Explanation:</strong> 274 + 181 = 455
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> num = [2,1,5], k = 806
<strong style="user-select: auto;">Output:</strong> [1,0,2,1]
<strong style="user-select: auto;">Explanation:</strong> 215 + 806 = 1021
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= num.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= num[i] &lt;= 9</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">num</code> does not contain any leading zeros except for the zero itself.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>