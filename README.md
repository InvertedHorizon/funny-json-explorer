# funny-json-explorer
## 内容
Funny JSON Explorer（**FJE**），是一个JSON文件可视化的命令行界面小工具

```shell
fje -f <json file> -s <style> -i <icon family>
```

```
{
    oranges: {
        'mandarin': {                            ├─ oranges
            clementine: null,                    │  └─ mandarin
            tangerine: 'cheap & juicy!'  -=>     │     ├─ clementine
        }                                        │     └─ tangerine: cheap & juicy!
    },                                           └─ apples
    apples: {                                       ├─ gala
        'gala': null,                               └─ pink lady
        'pink lady': null
    }
}
````

FJE可以快速切换**风格**（style），包括：树形（tree）、矩形（rectangle）；

```

├─ oranges                             ┌─ oranges ───────────────────────────────┐
│  └─ mandarin                         │  ├─ mandarin ───────────────────────────┤
│     ├─ clementine                    │  │  ├─ clementine ──────────────────────┤
│     └─ tangerine: cheap & juicy!     │  │  ├─ tangerine: cheap & juicy! ───────┤
└─ apples                              ├─ apples ────────────────────────────────┤
   └─ gala                             └──┴─gala ────────────────────────────────┘

        树形（tree）                                   矩形（rectangle）
````

也可以指定**图标族**（icon family），为中间节点或叶节点指定一套icon

```
├─♢oranges                                 
│  └─♢mandarin                             
│     ├─♤clementine                        
│     └─♤tangerine: cheap & juicy!    
└─♢apples                                  
   └─♤gala                                 

poker-face-icon-family: 中间节点icon：♢ 叶节点icon：♤
```

领域模型
![Funny JSON Explorer](https://github.com/InvertedHorizon/funny-json-explorer/assets/147272154/8ebe1472-7ae8-4181-9ba8-8a72af2f8f14)


## 作业要求

基于上述需求描述和领域模型，按照设计模式要求，进行软件设计，并编码实现（任何语言均可）。

用**工厂方法**（Factory）、**抽象工厂**（Abstract Factory）、**建造者**（Builder）模式、**组合模式**（Composition），完成功能的同时，使得程序易于扩展和维护。
1. （必做）：不改变现有代码，只需添加新的抽象工厂，即可添加新的风格
2. （选做）：通过配置文件，可添加新的图标族使

## 使用不同的设计模式完成fje的设计

以下结果使用java实现，图标族还没实现通过配置文件的方式配置，只是使用类来模拟。

### 工厂方法

说明
StyleVisualFactory是一个抽象工厂，负责创建不同的json可视化类型，比如tree，rectangle等；
TreeFactory是其中一种具体工厂，负责创建tree类型的可视化数据；
StyleVisualJson是一个抽象产品，负责创建json可视化类型的具体实现；
Tree是其中一种具体产品，负责实现可以使得json数据可视化为tree结构的具体对象；
FunnyJsonExplorer相当于一个客户端，通过从工厂获得json可视化模型以及icon，结合可视化。

类图
![image](https://github.com/InvertedHorizon/funny-json-explorer/assets/147272154/11e71c89-f6c7-46d6-91b0-7361e5e4e813)

结果
![image](https://github.com/InvertedHorizon/funny-json-explorer/assets/147272154/a94a2c6f-e59b-46f3-85c2-5ebd369be96e)

![image](https://github.com/InvertedHorizon/funny-json-explorer/assets/147272154/46c78184-464c-417e-90d5-6f1b90dc4579)

![image](https://github.com/InvertedHorizon/funny-json-explorer/assets/147272154/af88f7b8-aa10-45f8-b7ac-df11b53d6cb2)
可视化为矩形时有小问题。

### 抽象工厂
说明
将style和icon看作两类产品，某一种style和icon之间视为有相关性；
StyleAndVisualFactory是一个抽象工厂，负责创建style和icon两个产品；
TreeWeather是其中一个具体工厂，负责创建一组相关的产品，比如说tree style，weather icon；
FunnyJsonExplorer相当于客户端，可以判断命令行输入与某一具体工厂是否相符，符合则返回该工厂的产品，组合进行可视化。

类图


结果

### 建造者模式
说明
将style和icon组合成一个复杂产品Product；
Builder是一个抽象建造者，定义了建造Product的具体步骤接口；
ConcreteBuilder1是一个具体建造者，具体定义了复杂产品各部分是分别是怎样创建的；
Director是一个指挥者，负责指挥建造者各部分是如何有机组合成一个复杂产品的。

类图

结果

### 组合模式（还没实现）


