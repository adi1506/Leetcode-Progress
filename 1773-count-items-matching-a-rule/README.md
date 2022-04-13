<h2><a href="https://leetcode.com/problems/count-items-matching-a-rule/">1773. Count Items Matching a Rule</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array <code style="user-select: auto;">items</code>, where each <code style="user-select: auto;">items[i] = [type<sub style="user-select: auto;">i</sub>, color<sub style="user-select: auto;">i</sub>, name<sub style="user-select: auto;">i</sub>]</code> describes the type, color, and name of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> item. You are also given a rule represented by two strings, <code style="user-select: auto;">ruleKey</code> and <code style="user-select: auto;">ruleValue</code>.</p>

<p style="user-select: auto;">The <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> item is said to match the rule if <strong style="user-select: auto;">one</strong> of the following is true:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">ruleKey == "type"</code> and <code style="user-select: auto;">ruleValue == type<sub style="user-select: auto;">i</sub></code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">ruleKey == "color"</code> and <code style="user-select: auto;">ruleValue == color<sub style="user-select: auto;">i</sub></code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">ruleKey == "name"</code> and <code style="user-select: auto;">ruleValue == name<sub style="user-select: auto;">i</sub></code>.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the number of items that match the given rule</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> There is only one item matching the given rule, which is ["computer","silver","lenovo"].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= items.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= type<sub style="user-select: auto;">i</sub>.length, color<sub style="user-select: auto;">i</sub>.length, name<sub style="user-select: auto;">i</sub>.length, ruleValue.length &lt;= 10</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">ruleKey</code> is equal to either <code style="user-select: auto;">"type"</code>, <code style="user-select: auto;">"color"</code>, or <code style="user-select: auto;">"name"</code>.</li>
	<li style="user-select: auto;">All strings consist only of lowercase letters.</li>
</ul>
</div>