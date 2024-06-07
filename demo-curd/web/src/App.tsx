import axios from "axios";
import React, { useEffect, useState } from "react";

import { Table, Space } from "antd";
import type { TableProps } from "antd";

interface DataType {
  id: React.Key;
  username: string;
  password: string;
}

const columns: TableProps<DataType>["columns"] = [
  {
    title: "账号",
    dataIndex: "username",
    key: "username",
  },
  {
    title: "密码",
    dataIndex: "password",
    key: "password",
  },
  {
    title: "操作",
    key: "action",
    render: () => (
      <Space size="middle">
        <a>修改</a>
        <a>删除</a>
      </Space>
    ),
  },
];

interface AppProps {}

const App: React.FC<AppProps> = () => {
  let [dataSource, setDataSource] = useState<DataType[]>([]);

  useEffect(() => {
    axios("/user/page?page=1&pageSize=10").then((res) => {
      setDataSource(
        (res?.data?.data || []).map((item: DataType) => ({
          ...item,
          key: item.id,
        }))
      );
    });
  });

  return (
    <>
      <Table dataSource={dataSource} columns={columns} />
    </>
  );
};

export default App;
