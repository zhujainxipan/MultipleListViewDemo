# MultipleListViewDemo

listview多布局的设计，和一些设计模式结合

设计不重要，把设计思想落地才重要

底部不适合使用状态模式，还是使用工厂模式较为合适。

底部状态转化的需求：

1. 一般是回复后，然后从服务端拉取数据，然后根据数据来修改底部状态显示。这个不涉及内部两种状态之间的通信，因此认为使用工厂模式是最好的。

2. 如果底部两个状态可以相互转化，同时又配上情况1，就只能用状态模式了。状态模式怎么适应1呢？只需要不断通过context，setstate即可。内部的状态转化就更好说了。
