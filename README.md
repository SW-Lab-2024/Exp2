# SW-Lab

# Software lab @ SUT

# Contributors: Amirmahdi, Helia and Farhad

# آشنایی با اصول شئ‌گرایی (موسوم به اصول SOLID)

## اهداف

در این آزمایش هدف بر آن است که دانشجویان با به کارگیری اصول SOLID در یک پروژه‌ی عملی ساده آشنا شوند.

## نیازمندی‌ها

آشنایی اولیه با مفاهیم برنامه نویسی و طراحی شی‌گرا که دانشجویان قبلاً در درس برنامه‌سازی پیشرفته با آن آشنا شده‌اند.

## ابزارهای مورد استفاده

- یک Java IDE مانند IntelliJ IDEA و یا Eclipse به همراه jdk حداقل نسخه ۸

## منابع آموزشی

برای آشنایی با این اصول و آشنایی با منابع مناسب
به [اینجا](https://github.com/ssc-public/Software-Engineering-Lab/blob/main/educational-resources/SOLID/README.md)
مراجعه کنید.

## مقدمه

در این آزمایش شما خواهید آموخت که چگونه می‌توانید با به کارگیری اصول SOLID، نرم‌افزارهایی را بسازید که از نظر قابلیت
نگهداری و بهبود، در وضعیت مطلوبی باشند و مدیریت تغییرات در آن‌ها به آسانی میسر باشد (شک نکنید که به کارگیری این اصول
اساسی و بسیاری دیگر از اصول مهندسی نرم افزار، باعث تفاوت شما با سایر همکارانتان خواهد شد)

## بخش اول: توضیحاتی پیرامون برنامه‌ی داده شده

می‌توانید برنامه را
از [اینجا](https://github.com/ssc-public/Software-Engineering-Lab/tree/main/base-projects/SOLID-Principles) بارگیری
کنید.

### مفروضات مسئله

صورت آزمایش در درس افزار بارگزاری شده است و می‌توانید برای تحویل گزارش (با در نظر گرفتن ملاحظات گفته شده) از قالب های
زیر استفاده کنید.

## بخش دوم: دستور آزمایش

### گام ۱: افزودن یک روش پیام رسانی دیگر

	تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع پیام اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderRegister</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderPayment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>override کردن تابع phoneOrderRegister</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان phoneOrderRegister با بدنه خالی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>override کردن تابع phoneOrderPayment</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان phoneOrderPayment با بدنه خالی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>override کردن تابع phoneOrderRegister</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان phoneOrderRegister با بدنه خالی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>OnsiteOrderService</p>
</td>
<td width="141">
<p>override کردن تابع phoneOrderPayment</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان phoneOrderPayment با بدنه خالی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۷</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن کلاس PhoneOrderService به PaymentServices</p>
</td>
<td width="292">
<p>افزودن کلاس با عنوان PhoneOrderService برای سفارش‌های تلفنی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۸</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>override کردن تابع onlineOrderRegister</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان onlineOrderRegister با بدنه خالی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۹</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>override کردن تابع onSiteOrderRegister</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان onSiteOrderRegister با بدنه خالی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۰</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>override کردن تابع onlineOrderPayment</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان onlineOrderPayment با بدنه خالی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۱</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>override کردن تابع onSiteOrderPayment</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان onSiteOrderPayment با بدنه خالی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۲</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>override کردن تابع phoneOrderRegister</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان phoneOrderRegister برای ثبت سفارش‌های تلفنی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۳</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>override کردن تابع phoneOrderPayment</p>
</td>
<td width="292">
<p>پیاده سازی تابع void با عنوان phoneOrderPayment برای پرداخت سفارش‌های تلفنی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۴</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن روش سفارش تلفنی به راهنمای کاربر</p>
</td>
<td width="292">
<p>افزودن سفارش تلفنی به مقدار پرینت شده برای راهنمایی کاربر در جهت انتخاب روش سفارش</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۵</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن سفارش تلفنی به روش‌های سفارش</p>
</td>
<td width="292">
<p>پیاده سازی سفارش تلفنی به عنوان گزینه سوم برای انتخاب روش سفارش</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۶</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن پرداخت تلفنی به روش‌های پرداخت</p>
</td>
<td width="292">
<p>پیاده سازی پرداخت تلفنی برای انجام پرداخت در مواقع انتخاب سفارش تلفنی</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: ۱۶

### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر
کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>کلاس‌های <code>Order</code> و <code>Food</code> هر کدام یک مسئولیت واحد دارند: <code>Order</code> برای مدیریت سفارشات و <code>Food</code> برای مدیریت اطلاعات مربوط به غذاها.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس <code>OrderService</code> چندین مسئولیت مختلف را بر عهده دارد: ثبت سفارشات و مدیریت پرداخت‌ها برای سه نوع مختلف سفارش.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس‌های <code>OnlineOrderService</code>، <code>OnSiteOrderService</code>، و <code>PhoneOrderService</code> با استفاده از interface <code>OrderService</code> توسعه یافته‌اند و می‌توانند بدون تغییر در کد اصلی اضافه یا تغییر یابند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>هر بار که نوع جدیدی از سفارش بخواهیم اضافه کنیم، باید interface <code>OrderService</code> را تغییر دهیم که این اصل OCP را نقض می‌کند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>همه کلاس‌های که از <code>OrderService</code> ارث‌بری کرده‌اند می‌توانند جایگزین یکدیگر شوند بدون این که عملکرد اصلی تغییر کند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در هر کلاس فرزند، برخی از متدها بلا استفاده مانده‌اند و بدنه‌ای خالی دارند، که می‌تواند منجر به رفتارهای غیرمنتظره شود.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>هیچ موردی تحقق نیافته است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>interface <code>OrderService</code> شامل متدهایی است که در هر پیاده‌سازی نیازی به همه آنها نیست و بدنه‌ای خالی دارند، این امر باعث نقض این اصل می‌شود.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس <code>Main</code> به جای وابستگی به کلاس‌های خاص، به interface <code>OrderService</code> وابسته است که این اصل را تحقق می‌بخشد.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>هیچ موردی نقض نشده است.</p>
</td>
</tr>
</tbody>
</table>
در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>Single Responsibility</p>
</td>
<td width="246">
<p>کلاس <code>OrderService</code> چندین مسئولیت مختلف دارد.</p>
</td>
<td width="284">
<p>ایجاد interface های جداگانه برای ثبت سفارش و پرداخت و ایجاد کلاس‌های مجزا برای هر نوع سفارش.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Open-Close Principle (OCP)</p>
</td>
<td width="246">
<p>هر بار که نوع جدیدی از سفارش بخواهیم اضافه کنیم، باید interface <code>OrderService</code> را تغییر دهیم.</p>
</td>
<td width="284">
<p>استفاده از الگوی طراحی استراتژی برای مدیریت انواع مختلف سفارشات به جای افزودن متدهای جدید به interface.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Liskov Substitution Principle</p>
</td>
<td width="246">
<p>برخی از متدها در کلاس‌های فرزند بلا استفاده هستند و بدنه‌ای خالی دارند.</p>
</td>
<td width="284">
<p>استفاده از interface های کوچک‌تر و تخصصی‌تر به جای یک interface بزرگ برای جلوگیری از نیاز به متدهای بلا استفاده.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>interface <code>OrderService</code> شامل متدهایی است که در هر پیاده‌سازی نیازی به همه آنها نیست.</p>
</td>
<td width="284">
<p>تقسیم interface بزرگ به چندین interface کوچک‌تر که هر کدام مسئول یک مجموعه کوچکتر از وظایف باشند.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Dependency Inversion Principle</p>
</td>
<td width="246">
<p>هیچ موردی نقض نشده است.</p>
</td>
<td width="284">
<p>نیازی به راه‌حل نیست.</p>
</td>
</tr>
</tbody>
</table>

### گام ۳: اصلاح موارد نقض

در نهایت، بر اساس تحلیلی که انجام داده‌اید و راه حل‌هایی که در بخش قبل ارایه کردید، کد را اصلاح کرده و بر روی مخزن
گیت‌هاب و در پوشه‌ای مجزا از گام قبل commit و push کنید. انتظار می‌رود که تمامی راه حل‌های پیشنهادی خود را بر روی این
نسخه اعمال کنید و تمامی بهبودهایی که انجام می‌دهید، در جداول بخش قبل موجود باشد.

### گام ۴: بررسی مجدد تغییرات مورد نیاز

فرض کنید که گام 1 را برای کد اصلاح شده (پس از انجام گام‌های ۲ و ۳) اجرا کرده‌اید.

1. در این صورت از انجام کدام یک از تغییرات ثبت شده در جدول گام ۱ معاف خواهید شد؟
   پس از انجام اصلاحات بر اساس اصول SOLID:

Single Responsibility Principle (SRP):
اگر کلاس OrderService به چندین کلاس مجزا با مسئولیت‌های خاص تقسیم شده باشد، نیازی به تغییرات مکرر در آن برای اضافه کردن یا اصلاح روش‌های ثبت سفارش و پرداخت برای انواع مختلف سفارشات نخواهد بود.
Open-Closed Principle (OCP):
اگر از الگوی طراحی استراتژی استفاده شده باشد، اضافه کردن نوع جدید سفارش یا پرداخت نیازی به تغییر در کلاس‌های موجود نخواهد داشت. به عبارت دیگر، کلاس‌های جدید می‌توانند بدون تغییر در کدهای قبلی اضافه شوند.
Liskov Substitution Principle (LSP):
با پیاده‌سازی متدهای واقعی و حذف متدهای بلا استفاده، مشکلات مربوط به این اصل نیز رفع خواهد شد و نیازی به تغییرات مکرر در متدهای خالی نخواهد بود.
Interface Segregation Principle (ISP):
با تقسیم interface‌های بزرگ به چندین interface کوچک‌تر و تخصصی‌تر، کلاس‌های فرزند نیازی به پیاده‌سازی متدهای بلا استفاده نخواهند داشت. بنابراین، مشکلات مرتبط با این اصل نیز حل خواهد شد.
Dependency Inversion Principle (DIP):
اگر وابستگی به کلاس‌های خاص حذف شده و به جای آن‌ها از interface‌ها استفاده شود، تغییرات مورد نیاز برای تغییر وابستگی‌ها نیز به حداقل خواهد رسید.

3. تعداد تغییرات مورد نیاز، چند تغییر خواهد شد؟
 پس از اعمال اصلاحات بر اساس اصول SOLID، تغییرات مورد نیاز به شرح زیر کاهش می‌یابد:

حذف تغییرات مربوط به چندین مسئولیت در یک کلاس (SRP).
حذف تغییرات مربوط به اضافه کردن نوع جدید سفارش یا پرداخت (OCP).
حذف تغییرات مربوط به متدهای بلا استفاده (LSP).
حذف تغییرات مربوط به پیاده‌سازی interface‌های بزرگ (ISP).
حذف تغییرات مربوط به وابستگی به کلاس‌های خاص (DIP).
بنابراین، تعداد تغییرات نهایی به میزان تغییرات اولیه منهای تغییرات غیرضروری باقی می‌ماند. برای مثال، اگر در آزمایش 1 تعداد 5 تغییر ثبت شده باشد و هر یک از اصول SOLID یک تغییر را کاهش دهد، تعداد تغییرات نهایی به صفر می‌رسد.

اما اگر تعداد تغییرات اولیه را به طور دقیق بدانیم، می‌توانیم به طور دقیق تعداد تغییرات نهایی را محاسبه کنیم. برای مثال، اگر در آزمایش 1 تعداد 10 تغییر ثبت شده باشد و اصلاحات SOLID تعداد 5 تغییر را کاهش دهد، تعداد تغییرات نهایی 5 خواهد بود.



### گام ۵: جمع بندی

در این بخش، بیان کنید که از این گام چه نتیجه‌ای گرفته‌اید؟ و به نظر شما به کارگیری صحیح اصول SOLID در گام‌های ۳ و ۴ چه
مزایایی را نسبت به حالتی دارد که این اصول رعایت نشده‌بود؟

## نحوه ارسال پروژه:

1. گام ۱ را انجام داده و سپس کد نوشته شده‌ی خود را (با رعایت محدودیت‌های گفته شده در گام) در یک پوشه به نام
   Step_1_Non_SOLID ذخیره کنید و در مخزن گام ۲ قرار دهید. موارد توضیحی بایستی در بخش README مخزن قرار گیرد.
2. گام ۲ (که بخش تحلیلی است) در فایل README مربوط به مخزن گام ۲ آورده شود (تمام جداول با فرمت داده شده و عناوین هرکدام
   از سوالات پرسیده شده بایستی در README آورده شود).
3. گام ۳ که شامل بهبود است، بایستی به صورت جداگانه در پوشه دیگری به نام Step_3_With_SOLID قرار داده شود و در مخزن موجود
   باشد.
4. گام ۴ نیز در قالب توضیحات در README مخزن آورده شود.
5. گام ۵ (که نتیجه گیری است) در README مخزن آورده شود.
