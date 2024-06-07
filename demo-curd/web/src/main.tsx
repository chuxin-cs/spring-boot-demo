import ReactDOM from 'react-dom/client'
import App from './App.tsx'


import zhCN from 'antd/locale/zh_CN';
import 'dayjs/locale/zh-cn';
import { ConfigProvider } from 'antd';

ReactDOM.createRoot(document.getElementById('root')!).render(
    <ConfigProvider locale={zhCN}>
        {/*<React.StrictMode>*/}
            <App />
        {/*</React.StrictMode>,*/}
    </ConfigProvider>
)
