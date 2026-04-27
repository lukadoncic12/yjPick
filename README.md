# 印记Pick

一个本地生活服务推荐平台，实现了商家展示、优惠券秒杀、用户社交等功能。

## 技术栈

- Spring Boot 2.3.12
- MySQL 8.0 + Redis 6.0
- RabbitMQ + Redisson
- MyBatis-Plus + Lombok

## 功能模块

- 用户认证（Token登录、分布式Session）
- 商家查询（附近商家GEO搜索）
- 优惠券秒杀（Redis预检、异步下单、分布式锁）
- 社交互动（笔记点赞、用户关注）
- 用户签到统计（BitMap、HyperLogLog）



## 项目结构

```
com.yinji.pick/
├── config/         # 配置类
├── controller/     # 控制器
├── service/        # 服务层
├── mapper/         # 数据层
├── entity/         # 实体
├── dto/            # 数据传输对象
└── utils/          # 工具类
```

## 主要技术点

- Redis 缓存策略（穿透、雪崩、击穿解决方案）
- Redisson 分布式锁（可重入、Watch Dog机制）
- Lua 脚本保证原子性
- RabbitMQ 异步处理 + 死信队列
- GEO 数据结构实现附近搜索
