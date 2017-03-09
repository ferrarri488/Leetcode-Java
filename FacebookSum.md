# Facebook面试总结
------

从十月国庆节第一轮电话面试开始，到大年初六正式收到Offer，Facebook的事终于尘埃落定，只是在被Facebook HR电话告知确定Offer的那一刻心里很激动，之后就淡然了。目前已经提交了办签证的所有材料，等待着抽签结果了。无论是否抽上也无所谓，即便抽上了也不代表什么，只不过是个全新的开始，没抽上也不会失去什么，我还是我，在国内一样可以做的很好。尤其是经过了这几个月的努力，我终于顺利地达成了目标，原来高不可攀的东西现在被我踩在了脚下，让我坚信没有什么是做不到的，只要我想，只要我全力以赴。

总结一下整个面试过程吧，算是画上一个句号。

所有的面试都是英文交流，每轮时间严格限定在45分钟，刨去聊天和提问，剩下大概30分钟左右。写代码通常用白纸或白板，要讲解自己的思路，做出来前一题如果还有时间就会给你出下一题。要确保至少能做出两道题目，并且没有bug，能cover住所有Test cases，否则很可能就挂了。如果能做出三道题目就更好了，由于时间紧迫，所以需要代码简洁清晰，别拐到死胡同里了。总之Facebook很看重写代码的速度和Bug Free。

### 电话面试 ###
第一轮 - 十月上旬
这是HR面，不过基本是技术面，出了十来道关于Android的选择题

第二轮 - 十一月中旬
用Skype交流，问了下Android数据持久化有哪些手段，各自的应用场景。
然后废话不多说，在线写代码。

1、Integer to English words
比如给定123，要返回"One Hundred Twenty Three"，开始限定数的范围是1000以内，做出来之后会进一步提升难度，将范围扩充到INT_MAX。

2、First bad version
给出一系列版本号和一个判断版本是否正确的函数，让你找出第一个错误的版本号，由于版本号之间的依赖关系，后面的版本都是错的。




### Onsite面试 ###
一月中旬
第一轮，华人小哥
从小在加拿大成长的，在Facebook工作四年多，主要做UI Widget。
1、Construct Binary Tree from Inorder and Postorder Traversal
这个比较常规

2、Serialize and Deserialize Binary Tree
二叉树的序列化和反序列化，这个有递归和非递归的方法。

3、Set Matrix Zeroes
将矩阵中所有为0的元素的横向纵向全部清零，这道题看起来简单其实有点坑，通常会让你给出空间最优解。

第二轮：印度阿三
阿三全程绷着脸，让人心里瘆得慌
1、最喜欢的Android API，为什么
2、Move Zeroes
将一个数组的所有0元素移到数组后面，要操作次数最少，返回非零数的个数，不要求保持order。这里要注意的是确保操作次数是最少的。

3、Validate Binary Search Tree
判断一个BST是否合法

4、将二叉树按中序遍历转化成双链表

第三轮：以色列人
行为面试，为了很多问题，大部分记不清了，只想起来这几个
你工作过的公司中，按喜欢度排序，为什么
最喜欢的manager，最不喜欢的manager，为什么
如果你有更多power，你会对公司做什么改变
你和三年前比有哪些变化
你和同事有分歧，怎么处理的
你喜欢和什么样的人共事，不喜欢和什么样的人共事
介绍一个你最欣赏的同事
你做过最有挑战的事是什么
你为什么选择facebook，facebook为什么要选择你
你做过的失败的项目中有什么收获

第四轮：华人小哥
也是从小加拿大成长的，在Facebook工作四年多，做Messenger和React Native
系统设计
设计一个News Feed，类似于朋友圈，涉及网络请求，数据解析和存储，图片缓存，性能优化，数据库设计等等各方面。挺能看出一个人的水平，经验丰富的人横向纵向都能展开。


总结一下，三要素是英语、算法和技术。英语是很关键的，听不懂或者说不出来是很郁闷的。算法没有别的捷径，多做题多总结。技术就要靠自己平时积累了。