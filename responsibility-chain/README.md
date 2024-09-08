# 责任链模式

看了几个文章，这个感觉最清晰 https://liaoxuefeng.com/books/java/design-patterns/behavioral/chain-of-responsibility/index.html
在实际场景中，财务审批就是一个责任链模式。假设某个员工需要报销一笔费用，审核者可以分为：

Manager：只能审核1000元以下的报销；
Director：只能审核10000元以下的报销；
CEO：可以审核任意额度。