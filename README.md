# AI-Test-Framework

这是一个基于 Java 的接口自动化测试框架。（一句话说明项目用途）

## 🛠️ 技术栈
* 语言：Java 11+
* 构建工具：Maven
* 测试框架：TestNG / JUnit (根据你实际用的选)
* 接口请求库：RestAssured / OkHttp (根据你实际用的选)
* 报告：Allure Report (如果有的话)

## 📁 目录结构
```text
├── src
│   ├── main/java       # 核心封装代码 (如 HttpUtils, BaseTest)
│   └── test/java       # 测试用例存放区
├── pom.xml             # Maven 依赖管理
└── README.md           # 项目说明文档
